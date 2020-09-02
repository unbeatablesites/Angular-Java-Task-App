package com.taskApp.Task.controller;


import com.taskApp.Task.domain.Tasks;
import com.taskApp.Task.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/api/tasks")
public class TaskController {


        private TaskService taskService;
        public  TaskController(TaskService taskService){
            this.taskService = taskService;
        }

        @GetMapping(value = {"", "/"})


    public Iterable<Tasks> list(){
            return this.taskService.list();
        }


}
