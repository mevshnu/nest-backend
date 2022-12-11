package com.example.Nest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String taskTitle;
    private String taskDescription;
    private boolean taskStatus;
    private String taskDate;
    private String taskCompleteDate;
    private int empId;


    public Task() {
    }

    public Task(int id, String taskTitle, String taskDescription, boolean taskStatus, String taskDate, String taskCompleteDate, int empId) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.taskDate = taskDate;
        this.taskCompleteDate = taskCompleteDate;
        this.empId = empId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getTaskCompleteDate() {
        return taskCompleteDate;
    }

    public void setTaskCompleteDate(String taskCompleteDate) {
        this.taskCompleteDate = taskCompleteDate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
