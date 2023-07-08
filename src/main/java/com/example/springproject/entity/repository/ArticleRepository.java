package com.example.springproject.entity.repository;

import com.example.springproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    //꺽쇠 안쪽은 관리대상 바깥쪽은 관리대상 entity에서 대표값의 타입
    @Override
    ArrayList<Article> findAll();
}

