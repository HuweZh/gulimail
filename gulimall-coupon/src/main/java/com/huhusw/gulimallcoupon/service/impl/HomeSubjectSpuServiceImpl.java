package com.huhusw.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallcoupon.dao.HomeSubjectSpuDao;
import com.huhusw.gulimallcoupon.entity.HomeSubjectSpuEntity;
import com.huhusw.gulimallcoupon.service.HomeSubjectSpuService;


@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpuEntity> implements HomeSubjectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectSpuEntity> page = null;
        try {
            page = this.page(
                    new Query<HomeSubjectSpuEntity>().getPage(params),
                    new QueryWrapper<HomeSubjectSpuEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PageUtils(page);
    }

}
