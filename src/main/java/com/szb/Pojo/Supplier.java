package com.szb.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    private Integer id;
    private String name;
    private String phone;
    private String address;
}
