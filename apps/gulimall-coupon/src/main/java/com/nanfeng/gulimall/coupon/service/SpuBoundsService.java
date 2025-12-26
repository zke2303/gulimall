package com.nanfeng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nanfeng.gulimall.common.utils.PageUtils;
import com.nanfeng.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2025-12-25 22:05:52
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

