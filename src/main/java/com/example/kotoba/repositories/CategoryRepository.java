package com.example.kotoba.repositories;

import com.example.kotoba.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository <Category, Long>{

    List<Category> findByCategoryNameIgnoreCase(String categoryName);

}
