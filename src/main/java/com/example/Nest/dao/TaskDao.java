package com.example.Nest.dao;

import com.example.Nest.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface TaskDao extends CrudRepository<Task,Integer>
{
    @Query(value = "SELECT e.`emp_code`, e.`emp_name`, t.`task_description`, t.`task_status`, t.`task_title`, t.`task_complete_date`, t.`task_date` FROM `task` AS t JOIN `employee` AS e ON t.emp_id = e.id", nativeQuery = true)
    List<Map<String,String>> GetTask();
}
