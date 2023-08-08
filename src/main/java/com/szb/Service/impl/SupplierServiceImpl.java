package com.szb.Service.impl;

import com.szb.Mapper.SupplierMapper;
import com.szb.Pojo.Supplier;
import com.szb.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;
    @Override
    public List<Supplier> list() {
        List<Supplier> list = supplierMapper.supplierList();
        return list;
    }

    @Override
    public Supplier selectSupplierById(Integer id) {
        Supplier supplier = supplierMapper.selectSupplierById(id);
        return supplier;
    }

    @Override
    public int insertSupplier(Supplier supplier) {
        return supplierMapper.insertSupplier(supplier);
    }

    @Override
    public int updateSupplier(Supplier supplier) {
        return supplierMapper.updateSupplier(supplier);
    }

    @Override
    public int deleteSupplier(Integer id) {
        return supplierMapper.deleteSupplierById(id);
    }
}
