package com.example.Nest.controller;

import com.example.Nest.dao.TaskDao;
import com.example.Nest.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TaskController {
    @Autowired
    private TaskDao tdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addTask",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> AddTask(@RequestBody Task task)
    {

        tdao.save(task);
        HashMap<String,String> status = new HashMap<>();
        status.put("status","success");
        return status;

    }
}
