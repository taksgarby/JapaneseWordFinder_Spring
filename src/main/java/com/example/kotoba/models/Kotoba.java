package com.example.kotoba.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "kotobas")
public class Kotoba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "pronunciation")
    private String pronunciation;

    @Column(name = "hiragana_katakana")
    private String hiragana_katakana;

    @Column(name = "kanji")
    private String kanji;

    @JsonIgnoreProperties({"kotobas"})
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Kotoba(String name, String pronunciation, String hiragana_katakana, String kanji, Category category) {
        this.name = name;
        this.pronunciation = pronunciation;
        this.hiragana_katakana = hiragana_katakana;
        this.kanji = kanji;
        this.category = category;
    }

    public Kotoba() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getHiragana_katakana() {
        return hiragana_katakana;
    }

    public void setHiragana_katakana(String hiragana_katakana) {
        this.hiragana_katakana = hiragana_katakana;
    }

    public String getKanji() {
        return kanji;
    }

    public void setKanji(String kanji) {
        this.kanji = kanji;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
