package com.example.ead_exam.service;

import com.example.ead_exam.entity.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleService {
    List<Sale> findAllSale();
}
