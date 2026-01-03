package com.nanfeng.gulimall.member.dao;

import com.nanfeng.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2025-12-25 22:28:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
