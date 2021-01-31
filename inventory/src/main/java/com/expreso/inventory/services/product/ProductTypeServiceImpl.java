package com.expreso.inventory.services.product;

import com.expreso.inventory.model.ProductType;
import com.expreso.inventory.repositories.product.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    private ProductTypeRepository productTypeRepository;

    @Autowired
    public void setProductTypeRepository(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    @Override
    public Iterable<ProductType> listAllProductTypes() {
        return productTypeRepository.findAll();
    }

    @Override
    public ProductType getProductTypeById(Long id) {
        return productTypeRepository.findById(id).orElse(null);
    }

    @Override
    public ProductType saveProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }
}
