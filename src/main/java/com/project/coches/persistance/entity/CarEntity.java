package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_code")
    private Integer codeCar;

    @Column(name = "car_brand_id")
    private Integer brandCarId;

    @Column(name = "reference")
    private String reference;

    @Column(name = "price")
    private Double price;

    @Column(name = "model")
    private Double modelYear;

    @Column(name = "color")
    private String color;

    @Column(name = "horsepower_number")
    private Double horsepower;

    @Column(name = "door_number")
    private Integer numberDoor;

    @Column(name = "cylinder_capacity")
    private Double engineDisplacement;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "seat_quantity")
    private Integer numberSeats;

    @Column(name = "traction")
    private Integer traction;

    @Column(name = "direction")
    private String steering;

    @Column(name = "category")
    private String category;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "stock")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "car_brand_id", insertable = false, updatable = false)
    private BrandCarEntity brandCarEntity;

    @OneToMany(mappedBy = "carEntity")
    private List<CarPurchaseEntity> carPurchaseEntity;


    @Override
    public String toString() {
        return "CarEntity{" +
                "codeCar=" + codeCar +
                ", brandCarId=" + brandCarId +
                ", reference='" + reference + '\'' +
                ", price=" + price +
                ", modelYear=" + modelYear +
                ", color='" + color + '\'' +
                ", horsepower=" + horsepower +
                ", numberDoor=" + numberDoor +
                ", engineDisplacement=" + engineDisplacement +
                ", transmission='" + transmission + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", numberSeats=" + numberSeats +
                ", traction=" + traction +
                ", steering='" + steering + '\'' +
                ", category='" + category + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", brandCarEntity=" + brandCarEntity.toString() +
                '}';
    }
}
