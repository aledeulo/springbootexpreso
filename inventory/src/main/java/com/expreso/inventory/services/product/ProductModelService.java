package com.expreso.inventory.services.product;

import com.expreso.inventory.model.ProductModel;

public interface ProductModelService {

    Iterable<ProductModel> listAllProductModels();

    ProductModel getProductModelById(Long id);

    ProductModel saveProductModel(ProductModel model);
}
