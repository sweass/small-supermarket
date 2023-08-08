package com.szb.Controller;

import com.szb.Pojo.Category;
import com.szb.Pojo.Result;
import com.szb.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/selectAll")
    public Result list(){
        List<Category> categoryList = categoryService.listCategory();
        return Result.success(categoryList);
    }
    @GetMapping("/select/{id}")
    public Result selectById(@PathVariable(value = "id") Integer id){
        Category category = categoryService.selectCategoryById(id);
        return Result.success(category);
    }
    @PostMapping
    public Result insert(@Validated @RequestBody Category category){
        return Result.success(categoryService.insertCategory(category));
    }
    @PutMapping
    public Result update(@Validated @RequestBody Category category){
        return Result.success(categoryService.updateCategoryById(category.getId(),category));
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return  Result.success(categoryService.deleteCategoryById(id));
    }
}
