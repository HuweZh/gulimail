package com.huhusw.gulimallproduct.dao;

import com.huhusw.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 14:35:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
