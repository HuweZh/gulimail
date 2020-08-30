package com.huhusw.gulimallproduct.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallproduct.dao.CategoryDao;
import com.huhusw.gulimallproduct.entity.CategoryEntity;
import com.huhusw.gulimallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = null;
        try {
            page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PageUtils(page);
    }

    /**
     * 查询分类信息,并以树形结构返回
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 这个类实现了IService,将CategoryDao作为泛型传入了接口,baseMapper就是这个类型的dao,直接使用即可
        // 1. 查询所有的分类信息
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 2. 组成树形结构
        // 2.1找到所有的一级分类,父分类id为0
        List<CategoryEntity> firstLevel = entities.stream().filter((categoryEntity -> {
            return categoryEntity.getParentCid() == 0;
        })).map((menu)->{
            // 2.2为每一个一级分类设置子分类
            menu.setChildren(getChilder(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            // 2.3排序
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return firstLevel;
    }

    /**
     * 为root元素设置子分类
     * @param root
     * @param all
     * @return
     */
    List<CategoryEntity> getChilder(CategoryEntity root, List<CategoryEntity> all){
        List<CategoryEntity> collect = all.stream().filter((categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        })).map((categoryEntity -> {
            // 递归设置子分类
            categoryEntity.setChildren(getChilder(categoryEntity, all));
            return categoryEntity;
        })).sorted((menu1, menu2) -> {
            // 排序
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

}
