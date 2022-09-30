package com.Final.Year.controllers;

import com.Final.Year.service.ProductTypeService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductTypeController {

    private final ProductTypeService productTypeService;

    public ProductTypeController(ProductTypeService productTypeService) {
        this.productTypeService = productTypeService;
    }
}
