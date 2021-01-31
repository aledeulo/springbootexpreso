package com.expreso.inventory.services.product;

import com.expreso.inventory.model.ProductModel;
import com.expreso.inventory.repositories.product.ProductModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductModelServiceImpl implements ProductModelService {

    private ProductModelRepository repository;

    @Autowired
    public void setRepository(ProductModelRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<ProductModel> listAllProductModels() {
        return repository.findAll();
    }

    @Override
    public ProductModel getProductModelById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ProductModel saveProductModel(ProductModel model) {
        return repository.save(model);
    }
}
