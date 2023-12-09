package com.example.ead_exam.service.impl;

import com.example.ead_exam.entity.Product;
import com.example.ead_exam.repository.ProductRepository;
import com.example.ead_exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
private ProductRepository productRepository;
    @Override
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }
}

