package com.xyz.depend_service.repository;

import com.xyz.depend_service.entity.Depend;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependRepository  extends MongoRepository<Depend,String> {
}
