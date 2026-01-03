package com.nanfeng.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nanfeng.gulimall.common.utils.PageUtils;
import com.nanfeng.gulimall.common.utils.Query;
import com.nanfeng.gulimall.product.dao.CategoryDao;
import com.nanfeng.gulimall.product.entity.CategoryEntity;
import com.nanfeng.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1.查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 2.组装成父子的树形结构
        return entities.stream()
                // 1) 找出所有的 root 节点
                .filter(item -> item.getParentCid() == 0)
                // 2) 递归组装子节点
                .map(item -> {
                    item.setChildren(getChildren(item, entities));
                    return item;
                })
                // 3) 进行排序
                .sorted((item1, item2) ->
                        item1.getSort() == null ? 0 : item1.getSort() - (item2.getSort() == null ? 0 : item2.getSort())
                )
                // 4) 收集成一个列表
                .collect(Collectors.toList());
    }

    /**
     * 获取菜单的子菜单
     * @param root 父节点
     * @param all 所有的节点
     * @return root 节点的子节点
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream()
                .filter(item -> item.getParentCid().equals(root.getCatId()))
                .map(item -> {
                    item.setChildren(getChildren(item, all));
                    return item;
                })
                .sorted((item1, item2) ->
                        // 如果 getSort() 返回 null，则默认为 0
                        item1.getSort() == null ? 0 : item1.getSort() - (item2.getSort() == null ? 0 : item2.getSort())
                )
                .collect(Collectors.toList());
    }


}
