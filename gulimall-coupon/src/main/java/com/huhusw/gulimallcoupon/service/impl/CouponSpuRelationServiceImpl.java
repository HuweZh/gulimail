package com.huhusw.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallcoupon.dao.CouponSpuRelationDao;
import com.huhusw.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.huhusw.gulimallcoupon.service.CouponSpuRelationService;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelationEntity> implements CouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuRelationEntity> page = null;
        try {
            page = this.page(
                    new Query<CouponSpuRelationEntity>().getPage(params),
                    new QueryWrapper<CouponSpuRelationEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PageUtils(page);
    }

}
