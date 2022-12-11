package com.example.Nest.dao;

import com.example.Nest.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface AdminDao extends CrudRepository<Employee,Integer>
{
}
