package com.example.Nest.controller;


import com.example.Nest.dao.AdminDao;
import com.example.Nest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AdmonController {

    @Autowired
    private AdminDao admdao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addEmployee",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> AddEmployee(@RequestBody Employee emp)
    {
     admdao.save(emp);
     HashMap<String,String> status = new HashMap<>();
     status.put("status","success");
     return status;
    }
}
