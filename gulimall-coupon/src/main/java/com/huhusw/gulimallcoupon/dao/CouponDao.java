package com.huhusw.gulimallcoupon.dao;

import com.huhusw.gulimallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:06:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
