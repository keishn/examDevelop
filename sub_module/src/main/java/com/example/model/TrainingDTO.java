package com.example.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TrainingDTO {
    private Long userId;
    private LocalDateTime trainingTime;
}
