package com.example.springproject.capston;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;

public class JDBCCONNECTOR {

    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/capston-db" ,
                    "root", "1761011"); // sql에 연결

            Statement statement = connection.createStatement(); // sql문 실행하게하는 객체

            ResultSet resultSet = statement.executeQuery("select * from role"); // db명령을 dbms에 전달하고 그 출력결과를 가져오는 인터페이스

            while (resultSet.next()) {
                System.out.println(resultSet.getString("citizen"));
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }


}


