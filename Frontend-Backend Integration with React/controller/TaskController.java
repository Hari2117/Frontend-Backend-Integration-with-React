package com.taskmanager.controller;

import org.springframework.web.bind.annotation.*;
import com.taskmanager.service.TaskService;
import java.util.*;

@RestController
@RequestMapping("/tasks")

public class TaskController {

private final TaskService service;

public TaskController(TaskService service){
this.service = service;
}

@GetMapping
public List<String> getTasks(){

return service.getTasks();

}

}