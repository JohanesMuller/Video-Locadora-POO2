package br.unisc.video_locadora.SQLConnector;

/**
 *
 * @author will
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    public static Connection Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/video_locadora?"
                            + "user=root&password=root");
            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Seguinte erro ao tentar conectar: "+ex.getMessage());
            return null;
        }
    }
}
