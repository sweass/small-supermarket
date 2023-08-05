package com.szb.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods_remove_storage {
    private Integer id;
    private Integer goodsId;
    private Integer num;
    private Timestamp outDate;
}
