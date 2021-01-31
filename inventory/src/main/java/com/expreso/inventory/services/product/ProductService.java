package com.expreso.inventory.services.product;

import com.expreso.inventory.model.Product;

public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Long id);

    Product saveProduct(Product product);

}
