package com.xyz.tag_service.controller;

import com.xyz.tag_service.entity.Tag;
import com.xyz.tag_service.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tag")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;


    @GetMapping("/list")
    public ResponseEntity<List<Tag>> get() {
        return ResponseEntity.ok(this.tagService.get());
    }

    @PostMapping("/create")
    public ResponseEntity<Tag> create(@RequestBody Tag tag) {
        return new ResponseEntity<>(this.tagService.add(tag), HttpStatus.CREATED);
    }

}
