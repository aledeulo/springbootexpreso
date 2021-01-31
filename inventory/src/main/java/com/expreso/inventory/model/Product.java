package com.expreso.inventory.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private ProductType productType;
    @OneToOne
    private ProductBrand productBrand;
    @OneToOne
    private ProductModel productModel;

    private String photoUrl;
    private BigDecimal costPrice;
    private BigDecimal sellingPrice;

    public Product() {
    }


}
