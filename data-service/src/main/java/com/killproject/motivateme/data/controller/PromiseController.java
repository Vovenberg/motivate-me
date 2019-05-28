package com.killproject.motivateme.data.controller;

import com.killproject.motivateme.data.dto.Promise;
import com.killproject.motivateme.data.repository.PromiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromiseController {

    @Autowired
    private PromiseRepository promiseController;

    @GetMapping("/promises")
    public List<Promise> getAll() {
        return promiseController.findAll();
    }
}
