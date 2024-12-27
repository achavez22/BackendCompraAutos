package com.project.coches.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter @Setter
@Embeddable
public class CarPurchasePK implements Serializable {

    @Serial
    private static final long serialVersionUID = -2145479604343286721L;

    @Column(name = "cars_sales_invoice_number")
    private Integer purchaseNumberBill;

    @Column(name = "cars_sales_car_code")
    private Integer codeCar;
}
