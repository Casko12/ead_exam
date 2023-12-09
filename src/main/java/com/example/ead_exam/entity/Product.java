package com.example.ead_exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table (name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProdID")
    private Long ProdID;

    @Column(name = "ProdName")
    private String ProdName;

    @Column(name = "Description")
    private String Description;

    @Column(name = "DateOfManf")
    private Date DateOfManf;

    @Column(name = "Price")
    private Double Price;

    @OneToMany(
            mappedBy = "product",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnore
    private List<Sale> sales = new ArrayList<>();
}
