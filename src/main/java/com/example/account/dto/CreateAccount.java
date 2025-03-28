package com.example.account.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CreateAccount {
    @Getter
    @Setter
    public static class Request {
        private Long userId;
        private Long initialBalance;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private Long userId;
        private String accountNumber;
        private LocalDateTime registeredAt;
    }
}
