package com.chillzz.ManagementSystem;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KitchenManagementModel {

    String itemName;
    double quantity;
    double price;
}
