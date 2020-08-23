package com.huhusw.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallproduct.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-22 22:02:17
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

