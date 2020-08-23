package com.huhusw.gulimallware.dao;

import com.huhusw.gulimallware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:40:02
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
