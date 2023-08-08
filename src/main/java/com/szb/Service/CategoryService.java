package com.szb.Service;


import com.szb.Pojo.Category;

import java.util.List;

public interface CategoryService {
    /**
     * 查询全部商品分类list集合信息
     * @return List
     */
    List<Category> listCategory();

    /**
     * 按id查询单个供应商信息
     * @param id
     * @return Category
     */

    Category selectCategoryById(Integer id);

    /**
     * 增加商品分类信息
     * @param category
     * @return 结果
     */

    int insertCategory(Category category);

    /**
     * 根据id删除商品分类
     * @param id
     * @return 结果
     */

    int deleteCategoryById(Integer id);

    /**
     * 根据id更新商品分类
     * @param category
     * @return 结果
     */

    int updateCategoryById(Category category);

}
