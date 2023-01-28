package com.ott.todo.controller;

import com.ott.todo.domain.Todo;
import com.ott.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping
    public Todo insertTodo(@RequestBody Todo todo) {
        return todoService.insertTodo(todo);
    }

}
