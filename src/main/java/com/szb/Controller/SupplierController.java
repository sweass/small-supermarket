package com.szb.Controller;

import com.szb.Pojo.Result;
import com.szb.Pojo.Supplier;
import com.szb.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    /**
     * 查询所有的供应商信息list集合
     * @return
     */
    @GetMapping("/selectAll")
    public Result supplierList(){
        List<Supplier> supplierList = supplierService.list();
        return Result.success(supplierList);
    }
    /**
     * 根据id查询供应商信息
     * @param id
     * @return
     */
    @GetMapping("/select/{id}")
    public Result selectSupplierById(@PathVariable(value = "id") Integer id){
        Supplier supplier = supplierService.selectSupplierById(id);
        return Result.success(supplier);
    }
    /**
     * 增加供应商信息
     * @param supplier
     * @return
     */
    @PostMapping()
    public Result insertSupplier(@Validated @RequestBody Supplier supplier){
        return Result.success(supplierService.insertSupplier(supplier));
    }
    /**
     * 更改供应商信息
     * @param supplier
     * @return
     */
    @PutMapping()
    public Result updateSupplier(@Validated @RequestBody Supplier supplier){
        return Result.success(supplierService.updateSupplier(supplier));
    }
    /**
     * 删除供应商信息根据id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result deleteSupplier(@PathVariable Integer id){
        return Result.success(supplierService.deleteSupplier(id));
    }
}
