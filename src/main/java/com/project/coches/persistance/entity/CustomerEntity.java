package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@Table(name = "clientes")
public class CustomerEntity {

    @Id
    @Column(name = "cedula")
    private String cardId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private Double numberCellphone;

    @Column(name = "active")
    private Integer active;

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;

    @OneToMany(mappedBy = "customerEntity")
    private List<PurchaseEntity> purchaseEntity;
}
