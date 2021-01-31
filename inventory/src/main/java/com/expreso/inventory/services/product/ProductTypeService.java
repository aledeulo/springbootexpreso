package com.expreso.inventory.services.product;

import com.expreso.inventory.model.ProductType;

public interface ProductTypeService {

    Iterable<ProductType> listAllProductTypes();

    ProductType getProductTypeById(Long id);

    ProductType saveProductType(ProductType productType);
}
