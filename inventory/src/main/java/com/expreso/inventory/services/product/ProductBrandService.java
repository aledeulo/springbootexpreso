package com.expreso.inventory.services.product;

import com.expreso.inventory.model.ProductBrand;

public interface ProductBrandService {

    Iterable<ProductBrand> listAllProductBrands();

    ProductBrand getProductBrandById(Long id);

    ProductBrand saveProductBrand(ProductBrand brand);

}
