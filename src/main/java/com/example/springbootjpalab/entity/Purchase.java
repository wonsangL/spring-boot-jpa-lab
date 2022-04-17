package com.example.springbootjpalab.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Purchase {
    @Id
    private BigInteger id;

    @JsonManagedReference
    @OneToMany(mappedBy = "purchase", fetch = FetchType.EAGER)
//    @OneToMany
//    @JoinColumn(name = "order_id")
    private List<Product> products;

    @Column
    private LocalDateTime orderedDateTime;
}
