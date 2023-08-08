package com.szb.Service.impl;

import com.szb.Mapper.GoodsMapper;
import com.szb.Pojo.Goods;
import com.szb.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public List<Goods> goodsList() {
        List<Goods> goodsList = goodsMapper.goodsList();
        return goodsList;
    }

    @Override
    public Goods selectGoodsById(Integer id) {
        Goods goods = goodsMapper.selectGoodsById(id);
        return goods;
    }

    @Override
    public int insertGoods(Goods goods) {
        return goodsMapper.insertGoods(goods);
    }

    @Override
    public int deleteGoodsById(Integer id) {
        return goodsMapper.deleteGoodsById(id);
    }

    @Override
    public int updateGoodsById(Goods goods) {
        return goodsMapper.updateGoodsById(goods);
    }
}
