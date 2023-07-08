package com.example.springproject.dto;
import com.example.springproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 생성자를 쓴 것과 같은 효과
@ToString // tostring을 쓴 것과 똑같은 효과
public class Articleform {

    private Long id; // id필드추가

    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);

    }
}
