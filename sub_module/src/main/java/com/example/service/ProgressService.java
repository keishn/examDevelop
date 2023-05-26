package com.example.service;

import com.example.model.ProgressDTO;
import com.example.model.ProgressEntity;
import com.example.repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgressService {

    @Autowired
    private ProgressRepository progressRepository;

    public void addProgress(ProgressDTO progressDTO){
        ProgressEntity progressEntity = new ProgressEntity();
        progressEntity.setUserId(progressDTO.getUserId());
        progressEntity.setTrainingId(progressDTO.getTrainingId());
        progressEntity.setProgress(progressDTO.getProgress());
        progressRepository.save(progressEntity);
    }

}
