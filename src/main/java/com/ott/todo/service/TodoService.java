package com.ott.todo.service;

import com.ott.todo.domain.Todo;
import com.ott.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository tr;

    public List<Todo> getTodos() {
        return tr.findAll();
    }

    public Todo insertTodo(Todo todo) {
        return tr.save(todo);
    }

    public Todo updateTodo(Long id) {
        Optional<Todo> byId = Optional.of(tr.findById(id)
                .orElseThrow());

        Todo todo = new Todo();
        todo.setCompleted(!todo.isCompleted());
        return tr.save(todo);
    }

    public void deleteTodo(Long id) {
        tr.deleteById(id);
    }
}
