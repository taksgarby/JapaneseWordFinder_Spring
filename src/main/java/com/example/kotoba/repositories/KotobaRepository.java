package com.example.kotoba.repositories;

import com.example.kotoba.models.Kotoba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KotobaRepository extends JpaRepository<Kotoba, Long> {

    List<Kotoba> findByNameIgnoreCase(String name);



}
