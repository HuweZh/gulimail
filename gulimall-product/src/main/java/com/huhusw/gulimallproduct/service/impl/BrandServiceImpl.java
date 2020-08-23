package com.huhusw.gulimallproduct.service.impl;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.common.utils.Query;

import com.huhusw.gulimallproduct.dao.BrandDao;
import com.huhusw.gulimallproduct.entity.BrandEntity;
import com.huhusw.gulimallproduct.service.BrandService;

@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

    @SneakyThrows
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}
