package com.example.kotoba.controllers;

import com.example.kotoba.models.Category;
import com.example.kotoba.models.Kotoba;
import com.example.kotoba.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(value = "/categories")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Category>> getAllCategories(
            @RequestParam(name = "categoryName", required = false) String categoryName) {
        if (categoryName != null) {
            List<Category> categories = categoryRepository.findByCategoryNameIgnoreCase(categoryName);
            return new ResponseEntity<>(categories, HttpStatus.OK);
        }
        return new ResponseEntity<>(categoryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/categories/{id}")
    public ResponseEntity<Optional<Category>> getCategory(@PathVariable Long id) {
        return new ResponseEntity<>(categoryRepository.findById(id), HttpStatus.OK);

    }
}
