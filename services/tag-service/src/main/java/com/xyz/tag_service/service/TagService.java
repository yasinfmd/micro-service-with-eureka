package com.xyz.tag_service.service;

import com.xyz.tag_service.entity.Tag;
import com.xyz.tag_service.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagService {

    private final TagRepository tagRepository;

    public List<Tag> get() {
        return this.tagRepository.findAll();
    }

    public Tag add(Tag t) {
        Tag tag = Tag.builder().name(t.getName()).build();
        return this.tagRepository.save(t);
    }
}
