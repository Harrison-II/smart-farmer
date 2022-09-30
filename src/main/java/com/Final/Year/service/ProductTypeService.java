package com.Final.Year.service;

import com.Final.Year.models.ProductTypeModel;
import com.Final.Year.repositories.ProductTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {

    private final ProductTypeRepository productTypeRepository;

    public ProductTypeService(ProductTypeRepository productTypeRepository) {
        this.productTypeRepository = productTypeRepository;
    }

    public ProductTypeModel saveProductType(ProductTypeModel productType) {
        return productTypeRepository.save(productType);
    }

    public ProductTypeModel getProductType(long id) {
        return productTypeRepository.findById(id).get();
    }

    public List<ProductTypeModel> getAllProductTypes() {
        return productTypeRepository.findAll();
    }

    public ProductTypeModel updateProductType(ProductTypeModel productType) {
        return productTypeRepository.save(productType);
    }

    public void deleteProductTypeById(long id) {
        productTypeRepository.deleteById(id);
    }

    public void deleteAllProductTypes() {
        productTypeRepository.deleteAll();
    }
}
