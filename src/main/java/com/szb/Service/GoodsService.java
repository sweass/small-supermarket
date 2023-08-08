package com.szb.Service;

import com.szb.Mapper.GoodsMapper;
import com.szb.Pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface GoodsService {
    /**
     * 查询全部商品list集合信息
     * @return List
     */

    List<Goods> goodsList();

    /**
     * 按id查询单个商品信息
     * @param id
     * @return Goods
     */

    Goods selectGoodsById(Integer id);

    /**
     * 增加商品信息
     * @param goods
     * @return 结果
     */
    int insertGoods(Goods goods);

    /**
     * 根据id删除商品
     * @param id
     * @return 结果
     */
    int deleteGoodsById(Integer id);

    /**
     * 根据id更新商品
     * @param goods
     * @return 结果
     */
    int updateGoodsById(Goods goods);
}
