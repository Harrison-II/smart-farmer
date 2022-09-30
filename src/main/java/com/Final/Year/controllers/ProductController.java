package com.Final.Year.controllers;

import com.Final.Year.models.ProductModel;
import com.Final.Year.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getMyProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @GetMapping("/products/new")
    public String addProduct(Model model) {
        ProductModel product = new ProductModel();
        model.addAttribute("product", product);

        return "products";
    }

    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") ProductModel product, RedirectAttributes redirAttrs) {
        productService.saveProduct(product);
        redirAttrs.addFlashAttribute("success", "Operation Successful");
        return "redirect:/products";
    }

    @GetMapping("/products/edit/{id}")
    public String editProduct(@PathVariable long id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "products";
    }

    @PostMapping("/products/{id}")
    public String updateProduct(@PathVariable long id, @ModelAttribute("product") ProductModel product, RedirectAttributes redirAttrs) {
        ProductModel existingProduct = productService.getProduct(id);

        existingProduct.setName(product.getName());
        existingProduct.setProductCategory(product.getProductCategory());

        productService.updateProduct(existingProduct);
        redirAttrs.addFlashAttribute("success", "Operation Successful");
        return "redirect:/products";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable long id){
        productService.deleteProductById(id);
        return "redirect:/products";
    }
}
