package com.szb.Service.impl;


import com.szb.Mapper.CategoryMapper;
import com.szb.Pojo.Category;
import com.szb.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service   //交给Ioc
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper; //注入
    @Override
    public List<Category> listCategory() {
//        LambdaQueryWrapper<Category> lqw = new LambdaQueryWrapper<>();
        List<Category> categoryList = categoryMapper.categoryList();
        return categoryList;
    }

    @Override
    public Category selectCategoryById(Integer id) {
        Category category = categoryMapper.selectCategoryById(id);
        return category;
    }

    @Override
    public int insertCategory(Category category) {
        return categoryMapper.insertCategory(category);
    }

    @Override
    public int deleteCategoryById(Integer id) {
        return categoryMapper.deleteCategoryById(id);
    }

    @Override
    public int updateCategoryById(Category category) {
        return categoryMapper.updateCategoryById(category);
    }
}
