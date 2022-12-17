package com.example.kotoba.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "categoryName")
    private String categoryName;

    @JsonIgnoreProperties({"category"})
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Kotoba> kotobas;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.kotobas = new ArrayList<>();
    }

    public Category() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Kotoba> getKotobas() {
        return kotobas;
    }

    public void setKotobas(List<Kotoba> kotobas) {
        this.kotobas = kotobas;
    }
}
