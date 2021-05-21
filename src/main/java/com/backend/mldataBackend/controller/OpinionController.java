package com.backend.mldataBackend.controller;

import com.backend.mldataBackend.model.Opinion;
import com.backend.mldataBackend.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/opinion")

public class OpinionController {

    @Autowired
    OpinionService opinionService;

    @PostMapping
    public ResponseEntity<Opinion> saveOpinion(@Valid @RequestBody Opinion opinion) {
        Opinion response = opinionService.saveOpinion(opinion);

        return new ResponseEntity<Opinion>(response, new HttpHeaders(), HttpStatus.OK);
    }
}
