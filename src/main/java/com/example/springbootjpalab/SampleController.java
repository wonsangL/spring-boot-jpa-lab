package com.example.springbootjpalab;

import com.example.springbootjpalab.dto.PlayerDto;
import com.example.springbootjpalab.entity.Purchase;
import com.example.springbootjpalab.entity.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleController {
    private final SampleService service;

    @PostMapping("/player")
    public Player savePlayer(@RequestBody PlayerDto playerDto) {
        return service.savePlayer(playerDto);
    }

    @GetMapping("/order")
    public List<Purchase> getOrders() {
        return service.getOrders();
    }
}
