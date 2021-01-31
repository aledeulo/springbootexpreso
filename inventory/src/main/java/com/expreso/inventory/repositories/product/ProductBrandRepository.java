package com.expreso.inventory.repositories.product;

import com.expreso.inventory.model.ProductBrand;
import org.springframework.data.repository.CrudRepository;

public interface ProductBrandRepository  extends CrudRepository<ProductBrand, Long> {
}
