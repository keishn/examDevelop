package com.example.controller;

import com.example.model.TrainingDTO;
import com.example.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/training")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @PostMapping("/add_training")
    public @ResponseBody void addTraining(@RequestBody TrainingDTO trainingDTO) {trainingService.addTraining(trainingDTO);}

}
