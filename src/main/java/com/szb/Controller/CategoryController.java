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

    /**
     * 查询所有list信息
     * @return
     */
    @GetMapping("/selectAll")
    public Result list(){
        List<Category> categoryList = categoryService.listCategory();
        return Result.success(categoryList);
    }

    /**
     * 根据id查询单个信息
     * @param id
     * @return
     */
    @GetMapping("/select/{id}")
    public Result selectById(@PathVariable(value = "id") Integer id){
        Category category = categoryService.selectCategoryById(id);
        return Result.success(category);
    }

    /**
     * 增加信息 post请求
     * @param category
     * @return
     */
    @PostMapping
    public Result insert(@Validated @RequestBody Category category){
        return Result.success(categoryService.insertCategory(category));
    }

    /**
     * 更新信息 put请求
     * @param category
     * @return
     */
    @PutMapping
    public Result update(@Validated @RequestBody Category category){
        return Result.success(categoryService.updateCategoryById(category));
    }

    /**
     * 删除请求 delete请求
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return  Result.success(categoryService.deleteCategoryById(id));
    }
}