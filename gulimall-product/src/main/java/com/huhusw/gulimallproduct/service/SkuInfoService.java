package com.huhusw.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallproduct.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-22 22:02:17
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

