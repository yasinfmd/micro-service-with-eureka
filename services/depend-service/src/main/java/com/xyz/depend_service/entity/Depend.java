package com.xyz.depend_service.entity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode
@Builder
public class Depend {
    @Id
    private String id;
    private String name;
    private String todoId;
}
