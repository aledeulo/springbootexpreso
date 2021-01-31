package com.expreso.inventory.repositories.product;

import com.expreso.inventory.model.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface ProductModelRepository extends CrudRepository<ProductModel, Long> {
}
