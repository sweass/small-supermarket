package com.szb.Mapper;


import com.szb.Pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    /**
     *
     *
     * @return 查询供应商list集合参数信息
     */
    public List<Category> categoryList();
    public Category selectCategoryById(Integer id);
    public int insertCategory(Category category);
    public int deleteCategoryById(Integer id);
    public int updateCategoryById(Integer id,Category category);
}
