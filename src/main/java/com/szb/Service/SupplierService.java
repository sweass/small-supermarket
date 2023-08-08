package com.szb.Service;

import com.szb.Pojo.Supplier;

import java.util.List;

public interface SupplierService {
    /**
     * 查询全部供应商list集合信息
     * @return List
     */
    List<Supplier> list();

    /**
     * 按id查询单个供应商信息
     * @param id
     * @return Supplier
     */
    Supplier selectSupplierById(Integer id);

    /**
     * 增加供应商信息
     * @param supplier
     * @return 结果
     */
    int insertSupplier(Supplier supplier);

    /**
     * 根据id更改供应商
     * @param supplier
     * @return 结果
     */
    int updateSupplier(Supplier supplier);

    /**
     * 根据id删除供应商
     * @param id
     * @return 结果
     */
    int deleteSupplier(Integer id);
}
