package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "cars_sales")
public class CarPurchaseEntity {

    @EmbeddedId
    private CarPurchasePK id;

    @Column(name = "amount")
    private Integer quantity;

    private Integer total;

    @ManyToOne
    @MapsId(value = "purchaseNumberBill")
    @JoinColumn(name = "cars_sales_invoice_number", insertable = false, updatable = false)
    private PurchaseEntity purchaseEntity;

    @ManyToOne
    @JoinColumn(name = "cars_sales_car_code", insertable = false, updatable = false)
    private CarEntity carEntity;
}
