package org.example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product extends BaseModel {
    private String name;
    private String category;
    private int price;
    private int stock;

}
