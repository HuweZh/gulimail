package com.huhusw.gulimallproduct.dao;

import com.huhusw.gulimallproduct.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-22 22:02:17
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
