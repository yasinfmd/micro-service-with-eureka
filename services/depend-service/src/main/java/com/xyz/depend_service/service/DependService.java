package com.xyz.depend_service.service;

import com.xyz.depend_service.entity.Depend;
import com.xyz.depend_service.repository.DependRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DependService {
    private  final DependRepository dependRepository;


    public Depend create(Depend d){
       Depend depend=  Depend.builder().name(d.getName())
                .todoId(d.getTodoId()).build();

       return  this.dependRepository.save(depend);
    }

    public List<Depend> get() {
        return  dependRepository.findAll();
    }
}
