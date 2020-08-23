package com.huhusw.gulimallorder.dao;

import com.huhusw.gulimallorder.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:47:16
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
