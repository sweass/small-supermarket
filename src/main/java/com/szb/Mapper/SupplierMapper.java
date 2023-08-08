package com.szb.Mapper;

import com.szb.Pojo.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface SupplierMapper {
    /**
     * 查询所有供应商list信息
     * @return List
     */
    List<Supplier> supplierList();

    /**
     * 根据id查询供应商单个信息
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
     * 根据id更改商品信息
     * @param supplier
     * @return 结果
     */
    int updateSupplier(Supplier supplier);

    /**
     * 根据id删除商品信息
     * @param id
     * @return 结果
     */
    int  deleteSupplierById(Integer id);
}
