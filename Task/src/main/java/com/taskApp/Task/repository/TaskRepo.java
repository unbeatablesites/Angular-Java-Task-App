package com.taskApp.Task.repository;

import com.taskApp.Task.domain.Tasks;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<Tasks,Long> {
}
