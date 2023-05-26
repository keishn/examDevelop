package com.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgressDTO {

    private Long userId;
    private Long trainingId;
    private int progress;

}
