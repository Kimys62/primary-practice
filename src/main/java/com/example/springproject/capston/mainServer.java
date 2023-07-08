package com.example.springproject.capston;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import javax.websocket.server.ServerEndpointConfig;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//싱글톤 빈을 생성
@Component
//이걸 controller랑 합쳐야 할듯?? 다중상속이 안되서 닉네임을 어떻게 가져오지?
@Controller
//websocket의 호스트 주소를 설정함 예): new WebSocket(ws://localhost:8080/red_mafia);
@ServerEndpoint(value = "/red_mafia")
public class mainServer extends Socket{

    //순서가 있는 데이터 집합, 데이터 중복 허용
        static List<Session> session = Collections.synchronizedList(new ArrayList<Session>()); // <>안에 클래스 타입
    //Collections.synchronizedList는 session에 동기화 되지 않은 접근을 방지하기 위해 사용

    //websocket으로  브라우저가 접속하면 요청되는 함수
    @OnOpen
    public void onOpen(Session user){
        session.add(user);
    } // session에 추가

    //websocket으로 메세지가 오면 요청되는 함수
    @OnMessage
    public void onMessage(Session receive, String message) { // message는 수신된 메세지
        for(int i = 0; i < session.size(); i++){
            if(!receive.getId().equals(session.get(i).getId())) { //
                try {
                    // getBasicRemote는 초반에 설정한 endpoint의 value값에 텍스트 메세지 전송
                    //get(i)는 리스트 i번째
                    session.get(i).getBasicRemote().sendText(message); // 상대방이 쓴 걸 보냄
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    session.get(i).getBasicRemote().sendText(message); // 여기에 닉네임을 포함해서... 내가 쓴걸
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

    //websocket과 브라우저가 접속이 끊기면 요청되는 함수
    @OnClose
    public void onClose(Session session) throws IOException {
        session.close();
    }

    //websocket과 브라우저 간에 통신에러가 발생하면 요청되는 함수
    @OnError
    public void onError(Throwable t){
        t.printStackTrace();
    }



/*
    static int port = 8080;
    public static void main(String[] args) throws IOException {

        Socket socket = null; // 소켓생성
        ServerSocket server = null; // 서버 소켓생성
        BufferedReader in = null; // 입력버퍼 생성
        BufferedWriter out = null; // 출력버퍼 생성
        try{
            server = new ServerSocket(port);

                socket = server.accept(); // 클라이언트와 접속 대기


            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while(true){
                String inputMsg = in.readLine(); // 클라이언트로부터 한줄 읽기


            }

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    */



}

