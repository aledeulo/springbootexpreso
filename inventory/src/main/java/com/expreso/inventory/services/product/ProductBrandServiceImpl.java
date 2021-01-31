package com.expreso.inventory.services.product;

import com.expreso.inventory.model.ProductBrand;
import com.expreso.inventory.repositories.product.ProductBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductBrandServiceImpl implements ProductBrandService {

    private ProductBrandRepository productBrandRepository;

    @Autowired
    public void setProductBrandRepository(ProductBrandRepository productBrandRepository) {
        this.productBrandRepository = productBrandRepository;
    }

    @Override
    public Iterable<ProductBrand> listAllProductBrands() {
        return productBrandRepository.findAll();
    }

    @Override
    public ProductBrand getProductBrandById(Long id) {
        return productBrandRepository.findById(id).orElse(null);
    }

    @Override
    public ProductBrand saveProductBrand(ProductBrand brand) {
        return productBrandRepository.save(brand);
    }
}
