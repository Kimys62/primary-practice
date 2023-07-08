package com.example.springproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// bean 설정을 담당하는 클래스로 만들고, 이 클래스 안에서 @Bean이 들어간 메소드 선언시 빈을 정의함
@Configuration
// websocket을 사용한다는 설정
@EnableWebSocketMessageBroker
// 이걸 상속 받아 몇몇의 메소드를 구현하여 websocket 연결속성을 설정
public class socketconfig implements WebSocketMessageBrokerConfigurer {

    @Override
    // registerStompEndpoints를 사용해 클라이언트에서 websocket에 접속하는 endpoint를 등록
    public void registerStompEndpoints(StompEndpointRegistry registry) {

        // withSockJs는 브라우저에서 websocket을 지원하지 않는 경우의 대비책 옵션을 활성화
        // setAllowedOrigins("*")는 모든 도메인 요청을 허락
        registry.addEndpoint("/room_in").setAllowedOrigins("*").withSockJS();
    }
}
