/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laboratorio
 */
public class ConnectionUfn {
     public Connection getConnection(){
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bdaula01?userTimeZone=true&serverTimeZone=UTC",
                    "root","laboratorio");
            System.out.println("Conexão efetuada!");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar no BD"+e.getMessage());
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, e);
        }
        return  null;
    }
}
