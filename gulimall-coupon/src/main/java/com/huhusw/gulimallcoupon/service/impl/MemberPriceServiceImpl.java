package com.huhusw.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallcoupon.dao.MemberPriceDao;
import com.huhusw.gulimallcoupon.entity.MemberPriceEntity;
import com.huhusw.gulimallcoupon.service.MemberPriceService;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberPriceEntity> page = null;
        try {
            page = this.page(
                    new Query<MemberPriceEntity>().getPage(params),
                    new QueryWrapper<MemberPriceEntity>()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PageUtils(page);
    }

}
