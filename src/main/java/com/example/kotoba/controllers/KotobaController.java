package com.example.kotoba.controllers;

import com.example.kotoba.models.Kotoba;
import com.example.kotoba.repositories.KotobaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class KotobaController {

    @Autowired
    KotobaRepository kotobaRepository;

    @GetMapping(value = "/kotoba")
    public ResponseEntity<List<Kotoba>> getAllKotobas(@RequestParam(name="name", required = false) String name) {
        if(name != null) {
            List<Kotoba> kotobas = kotobaRepository.findByNameIgnoreCase(name);
            return new ResponseEntity<>(kotobas, HttpStatus.OK);
        }
        return new ResponseEntity<>(kotobaRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/kotoba/{id}")
    public ResponseEntity<Optional<Kotoba>> getKotoba(@PathVariable Long id) {
        return new ResponseEntity<>(kotobaRepository.findById(id), HttpStatus.OK);

    }

}
