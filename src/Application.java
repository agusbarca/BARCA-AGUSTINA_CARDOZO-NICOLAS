package com.backend;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {
    public static void main(String[] args) {
        //Muy bien chicos! lo �nico los paquetes entity y service deben ir dentro de com.backend
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:~/barca-cardozo;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "sa");

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }
}
