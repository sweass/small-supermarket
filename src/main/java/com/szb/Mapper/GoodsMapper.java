package com.szb.Mapper;

import com.szb.Pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper{
    /**
     * 查询所有商品list信息
     * @return list
     */
    List<Goods> goodsList();

    /**
     * 根据id查询商品分类单个信息
     * @param id
     * @return Goods
     */
    Goods selectGoodsById(Integer id);

    /**
     * 增加商品分类信息
     * @param goods
     * @return 结果
     */
    int insertGoods(Goods goods);

    /**
     * 根据id删除商品信息
     * @param id
     * @return 结果
     */
    int deleteGoodsById(Integer id);

    /**
     * 根据id更改商品信息
     * @param goods
     * @return 结果
     */
    int updateGoodsById(Goods goods);
}
