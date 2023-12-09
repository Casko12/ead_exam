package com.example.ead_exam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table (name = "sale")
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SlNo")
    private Long SlNo;

    @Column(name = "SalesmanID")
    private Long SalesmanID;

    @Column(name = "SalesmanName")
    private String SalesmanName;

    @Column(name = "dos")
    private Date DOS;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProdID")
    @JsonIgnore
    private Product product;
}
