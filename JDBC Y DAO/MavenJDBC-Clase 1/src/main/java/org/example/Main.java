package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

         String USER = "root";
         String PASSWORD = "root";
         String URL = "jdbc:mysql://localhost:3306/jdbc?useSSL=false";

       try{
         Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
           Statement statement = connection.createStatement();

           ResultSet resultSet = statement.executeQuery("SELECT * FROM registros");

           while (resultSet.next()){
               System.out.println(resultSet.getString("nombre") + " | " +
                       resultSet.getString("apellido") + " | " + resultSet.getString("email"));
           }

           connection.close();
           statement.close();
           resultSet.close();

       }catch (SQLException e){

           e.printStackTrace();

       }
    }
}
