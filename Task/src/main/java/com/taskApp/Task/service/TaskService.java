package com.taskApp.Task.service;

import com.taskApp.Task.domain.Tasks;

public interface TaskService {

    Iterable<Tasks> list();
}
