package com.example.service;

import com.example.model.TrainingDTO;
import com.example.model.TrainingsEntity;
import com.example.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;

    public void addTraining(TrainingDTO trainingDTO){
        TrainingsEntity trainingsEntity = new TrainingsEntity();
        trainingsEntity.setUserId(trainingDTO.getUserId());
        trainingsEntity.setTrainingTime(trainingDTO.getTrainingTime());
        trainingRepository.save(trainingsEntity);
    }

}
