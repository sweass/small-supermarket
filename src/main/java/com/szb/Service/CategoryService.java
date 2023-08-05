package com.szb.Service;


import com.szb.Pojo.Category;

import java.util.List;

public interface CategoryService {
    /**
     *
     * @return 查询全部供应商list集合信息
     */
    List<Category> listCategory();

    /**
     *
     * @param id
     * @return 按id查询单个供应商信息
     */

    Category selectCategoryById(Integer id);

    /**
     *
     * @param category
     * @return 结果
     */

    int insertCategory(Category category);

    /**
     *
     * @param id
     * @return 结果
     */

    int deleteCategoryById(Integer id);

    /**
     *
     * @param id
     * @param category
     * @return 结果
     */

    int updateCategoryById(Integer id,Category category);

}
