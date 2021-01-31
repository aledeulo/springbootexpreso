package com.expreso.inventory.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "product_type")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String typeName;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private Set<ProductBrand> brands = new HashSet<>();

    public ProductType() {
    }

    public ProductType(String typeName) {
        this.typeName = typeName;
    }

}
