package com.Final.Year.service;

import com.Final.Year.models.ProductCategoryModel;
import com.Final.Year.models.ProductTypeModel;
import com.Final.Year.repositories.ProductCategoryRepository;
import com.Final.Year.repositories.ProductTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryService(ProductCategoryRepository productTypeRepository) {
        this.productCategoryRepository = productTypeRepository;
    }

    public ProductCategoryModel saveProductCategory(ProductCategoryModel productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    public ProductCategoryModel getProductCategory(long id) {
        return productCategoryRepository.findById(id).get();
    }

    public List<ProductCategoryModel> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }

    public ProductCategoryModel updateProductCategory(ProductCategoryModel productType) {
        return productCategoryRepository.save(productType);
    }

    public void deleteProductCategoryById(long id) {
        productCategoryRepository.deleteById(id);
    }

    public void deleteAllProductCategories() {
        productCategoryRepository.deleteAll();
    }
}
