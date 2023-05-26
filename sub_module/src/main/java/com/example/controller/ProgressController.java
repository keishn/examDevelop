package com.example.controller;

import com.example.model.ProgressDTO;
import com.example.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/progress")
public class ProgressController {

    @Autowired
    private ProgressService progressService;

    @PostMapping("/add")
    public @ResponseBody void addProgress(@RequestBody ProgressDTO progressDTO) {
        progressService.addProgress(progressDTO);
    }


}
