package com.example.springproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능하게 함
@AllArgsConstructor
@NoArgsConstructor //디폴트 생성자 추가
@ToString
@Getter // get사용
public class Article {


    @Id //대표값을 지정(예):주민등록번호
    @GeneratedValue // 1, 2, 3 ... 자동 생성해줌
    private Long id; // 대표값

    @Column
    private String title;

    @Column
    private String content;



}
