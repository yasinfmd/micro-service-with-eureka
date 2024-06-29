package com.xyz.tag_service.repository;

import com.xyz.tag_service.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TagRepository  extends JpaRepository<Tag, UUID> {
}
