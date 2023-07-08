package com.example.springproject.entity;

import lombok.Getter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@AllArgsConstructor
@ToString
@Getter
public class Articlelogin { // 개체

    @Id // 대표값지정
    @Column
    private String id; // 닉네임

    public Articlelogin(String id) {

    }

    public Articlelogin() {

    }
}
