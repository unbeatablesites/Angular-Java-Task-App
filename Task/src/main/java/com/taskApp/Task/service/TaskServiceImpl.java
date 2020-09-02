package com.taskApp.Task.service;

import com.taskApp.Task.domain.Tasks;
import com.taskApp.Task.repository.TaskRepo;

public class TaskServiceImpl implements TaskService{

    private TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo){

        this.taskRepo = taskRepo;
    }

    @Override
    public Iterable<Tasks> list(){
        return this.taskRepo.findAll();
    }
}
