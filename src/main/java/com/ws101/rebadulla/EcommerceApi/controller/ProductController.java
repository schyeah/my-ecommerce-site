package com.ws101.rebadulla.EcommerceApi.controller;

import com.ws101.rebadulla.EcommerceApi.model.Product;
import com.ws101.rebadulla.EcommerceApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAll();
    }
}
