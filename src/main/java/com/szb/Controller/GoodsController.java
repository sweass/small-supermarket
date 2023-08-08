package com.szb.Controller;

import com.szb.Pojo.Goods;
import com.szb.Pojo.Result;
import com.szb.Service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * 查询所有的商品信息list集合
     * @return
     */
    @GetMapping("/selectAll")
    public Result list(){
        List<Goods> goodsList = goodsService.goodsList();
        return Result.success(goodsList);
    }

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    @GetMapping("/select/{id}")
    public Result selectGoodsById(@PathVariable(value = "id") Integer id){
        Goods goods = goodsService.selectGoodsById(id);
        return  Result.success(goods);
    }

    /**
     * 增加商品信息
     * @param goods
     * @return
     */
    @PostMapping()
    public Result insert(@Validated @RequestBody Goods goods){
        return Result.success(goodsService.insertGoods(goods));
    }

    /**
     * 更改商品信息
     * @param goods
     * @return
     */
    @PutMapping()
    public Result update(@Validated @RequestBody Goods goods){
        return Result.success(goodsService.updateGoodsById(goods));
    }

    /**
     * 删除商品信息根据id
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return Result.success(goodsService.deleteGoodsById(id));
    }
}
