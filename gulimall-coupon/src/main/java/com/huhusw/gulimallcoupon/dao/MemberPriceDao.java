package com.huhusw.gulimallcoupon.dao;

import com.huhusw.gulimallcoupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:06:14
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
