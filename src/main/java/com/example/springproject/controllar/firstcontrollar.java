package com.example.springproject.controllar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//컨트롤러 선언 (반드시)
@Controller
public class firstcontrollar {

    //url 연결 요청
    //localhost:8080/hi를 치면 greeting.mustache를 반환
    @GetMapping("/hi")
    public String hello(Model model1) { // 모델 받아오기(Model)를 파라메터에 추가
        model1.addAttribute("username", "예성"); // 변수등록
        return "greeting"; //templates/greeting.mustache -> 브라우저 전송
    }
    @GetMapping("/bye")
    public String world(Model model2) {
        model2.addAttribute("nickname", "예성");
        return "meet";
    }
}
