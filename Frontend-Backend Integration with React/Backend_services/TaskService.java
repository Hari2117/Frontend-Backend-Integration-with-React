package com.taskmanager.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TaskService {

private List<String> tasks = new ArrayList<>();

public List<String> getTasks(){

return tasks;

}

}