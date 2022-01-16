package com.example.springbootjpalab.repository;

import com.example.springbootjpalab.entity.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PlayerJapRepositoryTest {
    @Autowired
    private PlayerJapRepository repository;

    @Test
    void save_without_flush_test() {
        Player player = new Player();
        player.setName("wonsangl");
        player.setAge(32);
        player.setBirthday(LocalDateTime.now());

        repository.save(player);
    }

    @Test
    void save_with_flush_test() {
        Player player = new Player();
        player.setName("wonsangl");
        player.setAge(32);
        player.setBirthday(LocalDateTime.now());

        repository.saveAndFlush(player);
    }
}