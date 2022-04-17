package com.example.springbootjpalab.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@Entity
public class Product implements Serializable {
    @Id
    private BigInteger id;

//    @Id
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    @JsonBackReference
//    private Purchase purchase;

    @Column
    private String name;

    @Column
    private Double amount;

    @Column
    private String currencyCode;
}
