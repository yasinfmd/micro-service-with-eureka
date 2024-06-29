package com.xyz.depend_service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "todo-service",
        url = "${application.config.todo-url}"
)
public interface TodoClient {
    @GetMapping("/list")
    List<Object> todoList();
}
