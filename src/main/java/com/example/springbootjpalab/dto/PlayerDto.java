package com.example.springbootjpalab.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PlayerDto {
    private String name;
    private Integer age;
    private LocalDateTime birthday;
}
