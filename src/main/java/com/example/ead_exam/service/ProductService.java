package com.example.ead_exam.service;

import com.example.ead_exam.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> findAllProduct();
}
