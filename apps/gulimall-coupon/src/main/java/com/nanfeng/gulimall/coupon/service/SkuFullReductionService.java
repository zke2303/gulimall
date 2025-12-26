package com.nanfeng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nanfeng.gulimall.common.utils.PageUtils;
import com.nanfeng.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2025-12-25 22:05:53
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

