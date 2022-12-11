package com.example.Nest.dao;

import com.example.Nest.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskDao extends CrudRepository<Task,Integer>
{
}
