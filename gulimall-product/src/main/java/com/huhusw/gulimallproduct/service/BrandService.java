package com.huhusw.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 14:35:50
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

