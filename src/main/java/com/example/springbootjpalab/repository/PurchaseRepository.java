package com.example.springbootjpalab.repository;

import com.example.springbootjpalab.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, BigInteger> {
    List<Purchase> findAllByIdIn(List<BigInteger> ids);
}
