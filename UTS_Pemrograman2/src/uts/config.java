/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class config {

    public static Connection sambungDB() {
        formLogin f = new formLogin();

        String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String host = "localhost";
        String port = "3306";
        String password = "";
        String dbName = "perumahan";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useTimezone=true&serverTimezone=UTC";
        Connection kon = null;
        try {
            Class.forName(JDBC_DRIVER_CLASS).newInstance();
            kon = DriverManager.getConnection(url, username, password);
            System.out.println("koneksi: sukses!");
            return kon;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(0);
        }
        return null;
    }
}
