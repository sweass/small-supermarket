package com.szb.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer id;
    private String name;
    private Integer categoryId;
    private Integer inventoryNum;
    private Double price;
    private Timestamp dateOfProd;
    private Integer inDate;
}
