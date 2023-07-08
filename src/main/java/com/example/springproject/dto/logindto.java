package com.example.springproject.dto;

import com.example.springproject.entity.Articlelogin;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class logindto { // 데이터 전송 객체

    private String id;

    public Articlelogin tranfer() {
        return new Articlelogin(id);
    }
}
