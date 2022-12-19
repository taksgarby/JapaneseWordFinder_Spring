package com.example.kotoba.components;

import com.example.kotoba.models.Category;
import com.example.kotoba.models.Kotoba;
import com.example.kotoba.repositories.CategoryRepository;
import com.example.kotoba.repositories.KotobaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    KotobaRepository kotobaRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {
        Category relationships = new Category("Relationships");
        categoryRepository.save(relationships);
        Category mentality = new Category("Mentality");
        categoryRepository.save(mentality);
        Category popularCulture = new Category("Popular Culture");
        categoryRepository.save(popularCulture);
        Category nature = new Category("Nature");
        categoryRepository.save(nature);
        Category others = new Category("Others");
        categoryRepository.save(others);

        Kotoba love = new Kotoba("love", "ai", "あい", "愛", relationships);
        kotobaRepository.save(love);
        Kotoba passion = new Kotoba("passion", "jounetsu", "じょうねつ", "情熱", relationships);
        kotobaRepository.save(passion);
        Kotoba friend = new Kotoba("friend", "tomo", "とも", "友", relationships);
        kotobaRepository.save(friend);
        Kotoba kindness = new Kotoba("kindness", "yasashisa", "やさしさ", "優しさ", mentality);
        kotobaRepository.save(kindness);
        Kotoba flower = new Kotoba("flower", "hana", "はな", "花", nature);
        kotobaRepository.save(flower);
        Kotoba blueSky = new Kotoba("blue sky", "aozora", "あおぞら", "青空", nature);
        kotobaRepository.save(blueSky);
        Kotoba positivity = new Kotoba("positivity", "maemuki", "まえむき", "前向き", mentality);
        kotobaRepository.save(positivity);
        Kotoba pokemon = new Kotoba("Pokemon", "pokemon", "ポケモン", "not applicable", popularCulture);
        kotobaRepository.save(positivity);
        Kotoba demonSlayer = new Kotoba("Demon Slayer", "kimetsu no yaiba", "きめつのやいば", "鬼滅の刃", popularCulture);
        kotobaRepository.save(demonSlayer);
        Kotoba cat = new Kotoba("cat", "neko", "ねこ", "猫", others);
        kotobaRepository.save(cat);
        Kotoba goodFortune = new Kotoba("good fortune", "kou-un", "こううん", "幸運", others);
        kotobaRepository.save(goodFortune);

//        Kotoba love = new Kotoba("love", "ai", "ai", "ai", relationships);
//        kotobaRepository.save(love);
//        Kotoba passion = new Kotoba("passion", "jounetsu", "jounetsu", "jounetsu", relationships);
//        kotobaRepository.save(passion);
//        Kotoba friend = new Kotoba("friend", "tomo", "tomo", "tomo", relationships);
//        kotobaRepository.save(friend);


    }
}
