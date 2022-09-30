package com.Final.Year.controllers;

import com.Final.Year.service.ProductCategoryService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }


}
