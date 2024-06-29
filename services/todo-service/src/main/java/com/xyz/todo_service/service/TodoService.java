package com.xyz.todo_service.service;

import com.xyz.todo_service.entity.Todo;
import com.xyz.todo_service.repository.TodoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<Todo> get(){
        return  this.todoRepository.findAll();
    }

    public  Todo create(Todo t){
        Todo todo=new Todo();
        todo.setName(t.getName());
        todo.setIsActive(t.getIsActive());
        return  todoRepository.save(todo);
    }
}
