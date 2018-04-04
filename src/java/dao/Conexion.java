/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
/**
 *
 * @author conve
 */
public class Conexion {
    public static Connection conectar(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca","root","");
        }catch(ClassNotFoundException ex){
            return null;
        }catch(SQLException ex){
            return null;
        }
        
    }
}
