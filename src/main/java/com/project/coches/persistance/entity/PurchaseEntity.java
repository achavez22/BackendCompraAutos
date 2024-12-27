package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
@Entity
@Table(name = "sales")
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_number")
    private Integer numberBill;

    @Column(name = "customer_cedula")
    private String cardIdCustomer;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;

    private Double total;

    @Column(name = "payment_method")
    private String paymentMethod;

    @OneToMany(mappedBy = "purchaseEntity", cascade = {CascadeType.ALL})
    private List<CarPurchaseEntity> carsPurchase;

    @ManyToOne
    @JoinColumn(name = "customer_cedula", insertable = false, updatable = false)
    private CustomerEntity customerEntity;
}
