package com.bridgelabz.greeting_app_spring.entity;

import lombok.*;

@Data
@AllArgsConstructor
public class Greeting {
    private long id;
    private String message;
}