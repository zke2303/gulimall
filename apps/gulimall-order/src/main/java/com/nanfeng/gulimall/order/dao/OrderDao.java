package com.nanfeng.gulimall.order.dao;

import com.nanfeng.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2026-01-01 21:24:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
