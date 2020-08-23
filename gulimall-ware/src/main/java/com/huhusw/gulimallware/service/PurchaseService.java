package com.huhusw.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:40:02
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

