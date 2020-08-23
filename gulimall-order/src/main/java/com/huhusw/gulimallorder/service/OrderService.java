package com.huhusw.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huhusw.common.utils.PageUtils;
import com.huhusw.gulimallorder.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:47:16
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

