package com.xyz.depend_service.controller;

import com.xyz.depend_service.entity.Depend;
import com.xyz.depend_service.service.DependService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/depend")
@RequiredArgsConstructor
public class DependController {
    private  final DependService dependService;

    @PostMapping("/create")
    public ResponseEntity<Depend> create(@RequestBody Depend depend){
        return ResponseEntity.ok(this.dependService.create(depend));
    }

    @GetMapping("/list")
    public  ResponseEntity<List<Depend>> get(){
        return  ResponseEntity.ok(dependService.get());
    }
}
