package com.digitalbank.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Transaction {
    private TransactionType type;
    private double amount;
    private LocalDateTime timestamp;
}

