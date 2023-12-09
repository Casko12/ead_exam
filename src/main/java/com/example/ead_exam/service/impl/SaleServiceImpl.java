package com.example.ead_exam.service.impl;

import com.example.ead_exam.entity.Sale;
import com.example.ead_exam.repository.SaleRepository;
import com.example.ead_exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Override
    public List<Sale> findAllSale() {
        return saleRepository.findAll();
}
