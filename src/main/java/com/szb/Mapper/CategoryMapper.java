package com.szb.Mapper;


import com.szb.Pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    /**
     * 查询所有商品分类list信息
     * @return list
     */
    List<Category> categoryList();

    /**
     * 根据id查询商品分类单个信息
     * @param id
     * @return category
     */
    Category selectCategoryById(Integer id);

    /**
     * 增加商品分类信息
     * @param category
     * @return 结果
     */
    int insertCategory(Category category);

    /**
     * 根据id删除商品分类信息
     * @param id
     * @return 结果
     */
    int deleteCategoryById(Integer id);

    /**
     * 根据id更改商品分类信息
     * @param category
     * @return 结果
     */
    int updateCategoryById(Category category);
}
