package com.expreso.inventory.repositories.product;

import com.expreso.inventory.model.ProductType;
import org.springframework.data.repository.CrudRepository;

public interface ProductTypeRepository  extends CrudRepository<ProductType, Long> {
}
