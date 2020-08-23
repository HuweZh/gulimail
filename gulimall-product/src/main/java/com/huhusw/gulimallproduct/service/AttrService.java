package com.huhusw.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 14:35:51
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

