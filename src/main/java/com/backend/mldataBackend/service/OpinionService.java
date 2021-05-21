package com.backend.mldataBackend.service;

import com.backend.mldataBackend.model.Opinion;
import com.backend.mldataBackend.repository.OpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpinionService {

    @Autowired
    OpinionRepository opinionRepository;

    public Opinion saveOpinion(Opinion entity) {
        return opinionRepository.save(entity);
    }
}
