package com.expreso.inventory.model;

import javax.persistence.*;

@Entity
@Table(name = "product_model")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand", nullable = false)
    private ProductBrand brand;

    public ProductModel() {
    }

    public ProductModel(String model) {
        this.model = model;
    }

}
