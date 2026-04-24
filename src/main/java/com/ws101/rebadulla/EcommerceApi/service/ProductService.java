package com.ws101.rebadulla.EcommerceApi.service;

import com.ws101.rebadulla.EcommerceApi.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        // Sample data for your lab
        productList.add(new Product(nextId++, "Gaming Mouse", "RGB Wireless", 25.0, "Electronics", 50));
        productList.add(new Product(nextId++, "Mechanical Keyboard", "Blue Switches", 45.0, "Electronics", 30));
    }

    public List<Product> getAll() { return productList; }
}
