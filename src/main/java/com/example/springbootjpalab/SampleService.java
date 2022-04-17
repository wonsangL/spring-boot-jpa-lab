package com.example.springbootjpalab;

import com.example.springbootjpalab.dto.PlayerDto;
import com.example.springbootjpalab.entity.Purchase;
import com.example.springbootjpalab.entity.Player;
import com.example.springbootjpalab.repository.PurchaseRepository;
import com.example.springbootjpalab.repository.PlayerCrudRepository;
import com.example.springbootjpalab.repository.PlayerJapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {
    private final PlayerJapRepository jpaRepository;
    private final PlayerCrudRepository crudRepository;

    private final PurchaseRepository purchaseRepository;

    public Player savePlayer(PlayerDto playerDto) {
        Player player = new Player();
        player.setName(playerDto.getName());
        player.setAge(playerDto.getAge());
        player.setBirthday(playerDto.getBirthday());

        return jpaRepository.save(player);
    }

    public List<Purchase> getOrders() {
        return purchaseRepository.findAllByIdIn(Arrays.asList(new BigInteger("2"), new BigInteger("3")));
    }
}
