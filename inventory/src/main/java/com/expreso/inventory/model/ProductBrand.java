package com.expreso.inventory.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product_brand")
public class ProductBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type")
    private ProductType type;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
    private Set<ProductModel> productModels = new HashSet<>();

    public ProductBrand() {
    }

    public ProductBrand(String brand) {
        this.brand = brand;
    }

}
