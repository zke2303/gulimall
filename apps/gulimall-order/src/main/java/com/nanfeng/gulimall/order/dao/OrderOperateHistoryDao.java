package com.nanfeng.gulimall.order.dao;

import com.nanfeng.gulimall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2026-01-01 21:24:58
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
