package com.example.springproject.controllar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import com.example.springproject.dto.logindto;
import com.example.springproject.entity.Articlelogin;
import com.example.springproject.entity.repository.loginRepository;
//import jdk.internal.net.http.common.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;

import java.util.Optional;

@WebServlet(urlPatterns = "/index") // 서블릿과 매핑될 url패턴을 지정할 때 사용
@Controller
@Slf4j
public class logincontroller extends HttpServlet { // 이클래스를 상속받아야 서블릿이 동작함

    private HandshakeCompletedEvent request;
    HttpSession session = (HttpSession) request.getSession();




    String nickname1 = null;


    //String articleid;


    @RequestMapping(value = "/login")
    public String age(@RequestBody String req, HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
        nickname1 = req;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/capston-db",
                "root", "1761011"); // sql에 연결


        String query = "SELECT * FROM 테이블이름 WHERE 닉네임자리 = ?"; // 찾는 DB에서 nickname이 포함되어있는건 전부 가져옴
        String query1 = "INSERT INTO 테이블(닉네임자리) VALUES (?)";
        ResultSet resultSet = null;

        HttpSession session = request.getSession();
        request.getSession().invalidate(); // 세션 무효화
        request.getSession(true); // 새로운 세션 ID발급


        response.setContentType("text/html; charset=UTF-8"); // 문자셋 설정
        PrintWriter out = response.getWriter(); // 텍스트 기록이 가능해짐

        try {
            PreparedStatement statement = connection.prepareStatement(query); // preparedstatement는 미완성된 문자전달

            statement.setString(1, nickname1); // 첫번째 물음표에 넣기

            resultSet = statement.executeQuery(); // 던진 값의 결과를 가져옴


            if(resultSet.next()){
                out.println("<script>alert('중복입니다');history.go(-1);</script>"); // history.go(-1)는 이전 페이지로 없으면 이동안함
                out.flush(); // 저장된 내용을 클라이언트에 전송하고 버퍼를 비움
            }
/*
            while(resultSet.next()){//
                if(nickname1 == resultSet.getString("닉네임 저장된 컬럼이름")) {
                    out.println("<script>alert('중복입니다');history.go(-1);</script>"); // history.go(-1)는 이전 페이지로 없으면 이동안함
                    out.flush(); // 저장된 내용을 클라이언트에 전송하고 버퍼를 비움
                    return "index";
                }
                else
                    continue;
            }
*/
            statement = connection.prepareStatement(query1);
            statement.setString(1,nickname1); // 닉네임 db에 넣기

        }
        catch (SQLException e){
            e.printStackTrace();
        }


        return "login";
    }

    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection("database-1.caxyf4kvshky.ap-northeast-2.rds.amazonaws.com",
                    "admin", "zoatmxhs12"); // sql에 연결

            Statement statement = connection.createStatement(); // sql문 실행하게하는 객체

            ResultSet resultSet = statement.executeQuery("select * from 테이블이름");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("컬럼이름"));
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
/*
    // 닉네임 확인??
    public String select(String nickname) throws SQLException {

        Connection connection = DriverManager.getConnection("database-1.caxyf4kvshky.ap-northeast-2.rds.amazonaws.com",
                "admin", "zoqtmxhs12"); // sql에 연결

        nickname = "%" + nickname + "%";
        String query = "SELECT * FROM 테이블이름 WHERE 닉네임자리 LIKE ?"; // 찾는 DB에서 nickname이 포함되어있는건 전부 가져옴
        String query1 = "INSERT INTO 테이블(닉네임자리) VALUES ?";
        ResultSet resultSet = null;

        try {
            PreparedStatement statement = connection.prepareStatement(query); // preparedstatement는 미완성된 문자전달

            statement.setString(1, nickname); // 첫번째 물음표에 넣기

            resultSet = statement.executeQuery(); // 던진 값의 결과를 가져옴

            while(resultSet.next()){//
                if(nickname1 == resultSet.getString("닉네임 저장된 컬럼이름")) {
                    return "/index";
                }
                else
                    continue;
            }

            statement = connection.prepareStatement(query1);
            statement.setString(1,nickname); // 닉네임 db에 넣기

        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return "";
    }
*/
    @PostMapping("/logout") // 로그아웃
    public String logout(Model model, HttpSession session,
                         HttpServletRequest request, HttpServletResponse response) throws SQLException{
        Connection connection = DriverManager.getConnection("database-1.caxyf4kvshky.ap-northeast-2.rds.amazonaws.com",
                "admin", "zoqtmxhs12"); // sql에 연결

        String nickname2 = nickname1;

        String query3 = "DELETE FROM 테이블이름 WHERE 컬럼이름 = ? ";
        ResultSet resultSet = null;

        try{
            PreparedStatement statement = connection.prepareStatement(query3);
            statement.setString(1, nickname2);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        session.invalidate();
        return "redirect:index";
    }



/*
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        nickname1 = req.getParameter("nick");

    }
*/


/*

    @Autowired//객체 자동연결
    private loginRepository LoginReposirory;

    @GetMapping("logins/web")
    public String Articleview() {
        return "logins/web";
    }

    @PostMapping("/logins/room" )
    public String idin(logindto dto) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/capston-db",
                "root", "1761011"); // sql에 연결

        PreparedStatement statement = null; // sql문 실행하게하는 객체

        ResultSet resultSet = null;

        log.info(dto.toString()); // id

        Articlelogin articlelogin = dto.tranfer(); // 데이터 삽입

        articleid = articlelogin.toString();

        select(articleid); // 쓴 닉네임 확인절차

        //String sql = "insert into role(id) values ('" + articleid + "')";
        //statement = connection.prepareStatement(sql);
        //log.info(articlelogin.toString()); //  id
        //resultSet = statement.executeQuery();
        //Articlelogin saved = LoginReposirory.save(articlelogin); // db에 저장
        //log.info(saved.toString()); //no (1부터 순서대로), id

        return "/logins/room";

    }
    */


    /*
    @GetMapping("/logins/delete")
    public String idout() throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/capston-db",
                "root", "1761011"); // sql에 연결

        PreparedStatement statement = null; // sql문 실행하게하는 객체

        ResultSet resultSet = null;

        String sql = "delete from role" + "where ('" + articleid + "')";

        resultSet = statement.executeQuery(sql);
        return "redirect:/logins/web";
    }
*/





}
