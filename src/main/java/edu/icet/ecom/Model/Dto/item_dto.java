package edu.icet.ecom.Model.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class item_dto {
    private Long id;
    private String name;
    private int qty;
    private double discount;
    private double price;


}
