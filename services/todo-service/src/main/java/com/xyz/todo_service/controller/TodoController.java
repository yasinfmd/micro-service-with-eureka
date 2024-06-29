package com.xyz.todo_service.controller;

import com.xyz.todo_service.entity.Todo;
import com.xyz.todo_service.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo/")
@AllArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/list")
    public ResponseEntity<List<Todo>> get() {
        return ResponseEntity.ok(todoService.get());
    }

    @PostMapping("/create")
    public ResponseEntity<Todo> create(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.create(todo), HttpStatus.CREATED);
    }

}
