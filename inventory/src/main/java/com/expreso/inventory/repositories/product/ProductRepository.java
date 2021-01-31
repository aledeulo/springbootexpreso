package com.expreso.inventory.repositories.product;

import com.expreso.inventory.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
