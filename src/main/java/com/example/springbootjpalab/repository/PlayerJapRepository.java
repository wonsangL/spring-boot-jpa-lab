package com.example.springbootjpalab.repository;

import com.example.springbootjpalab.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PlayerJapRepository extends JpaRepository<Player, BigInteger> {
}
