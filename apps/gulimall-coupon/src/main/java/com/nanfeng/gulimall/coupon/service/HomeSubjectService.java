package com.nanfeng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nanfeng.gulimall.common.utils.PageUtils;
import com.nanfeng.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author nanfeng
 * @email nanfeng.dev@gmail.com
 * @date 2025-12-25 22:05:53
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

