package com.example.springbootjpalab.repository;

import com.example.springbootjpalab.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PlayerCrudRepository extends CrudRepository<Player, BigInteger> {
}
