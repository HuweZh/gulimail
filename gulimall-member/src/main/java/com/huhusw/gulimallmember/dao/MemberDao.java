package com.huhusw.gulimallmember.dao;

import com.huhusw.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huhusw
 * @email zhw969@gmail.com
 * @date 2020-08-23 17:32:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
