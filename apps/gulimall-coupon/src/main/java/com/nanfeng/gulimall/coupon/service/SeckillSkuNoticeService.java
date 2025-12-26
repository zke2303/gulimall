package com.nanfeng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nanfeng.gulimall.common.utils.PageUtils;
import com.nanfeng.gulimall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2025-12-25 22:05:53
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

