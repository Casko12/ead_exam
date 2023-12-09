package com.example.ead_exam.controller;

import com.example.ead_exam.entity.Product;
import com.example.ead_exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public String findAllSaleProduct(Model model) {
        List<Product> products = productService.findAllProduct();
        model.addAttribute("products", products);
        return "product";
    }

}
