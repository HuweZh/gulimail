package com.huhusw.gulimallcoupon.dao;

import com.huhusw.gulimallcoupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:06:13
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
