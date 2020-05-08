package com.github.leonardofirmeza.project1;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class Application {

    public static void main(String[] args) throws Exception {

        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASS");

        ResultSet resultSet = DriverManager
                .getConnection(url, user, password)
                .prepareStatement("select * from users")
                .executeQuery();

        while (resultSet.next()) {
            System.out.println("Nome: " + resultSet.getString("name"));
        }
    }
}
