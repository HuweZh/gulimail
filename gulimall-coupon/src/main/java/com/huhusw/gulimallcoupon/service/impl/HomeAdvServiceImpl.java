package com.huhusw.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallcoupon.dao.HomeAdvDao;
import com.huhusw.gulimallcoupon.entity.HomeAdvEntity;
import com.huhusw.gulimallcoupon.service.HomeAdvService;


@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvEntity> page = null;
        try {
            page = this.page(
                    new Query<HomeAdvEntity>().getPage(params),
                    new QueryWrapper<HomeAdvEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PageUtils(page);
    }

}
