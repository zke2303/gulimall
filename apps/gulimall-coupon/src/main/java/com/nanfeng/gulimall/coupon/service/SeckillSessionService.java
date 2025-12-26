package com.nanfeng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nanfeng.gulimall.common.utils.PageUtils;
import com.nanfeng.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2025-12-25 22:05:53
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

