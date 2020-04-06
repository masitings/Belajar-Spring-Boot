package com.masiting.crud.controller;

import com.masiting.crud.entity.Product;
import com.masiting.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }

    @PostMapping("/add-products")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProduct()
    {
        return service.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return service.getProductById(id);
    }

//    @GetMapping("/product/{name}")
//    public Product findProductByName(@PathVariable String name)
//    {
//        return service.getProductByName(name);
//    }

    @PutMapping("/update-product")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return service.deleteProduct(id);
    }
}
