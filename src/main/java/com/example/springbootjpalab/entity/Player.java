package com.example.springbootjpalab.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private LocalDateTime birthday;
}
