package com.huhusw.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallcoupon.dao.SeckillSkuNoticeDao;
import com.huhusw.gulimallcoupon.entity.SeckillSkuNoticeEntity;
import com.huhusw.gulimallcoupon.service.SeckillSkuNoticeService;


@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity> implements SeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuNoticeEntity> page = null;
        try {
            page = this.page(
                    new Query<SeckillSkuNoticeEntity>().getPage(params),
                    new QueryWrapper<SeckillSkuNoticeEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PageUtils(page);
    }

}
