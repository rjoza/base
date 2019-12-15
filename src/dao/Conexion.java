/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ronny.joza
 */
public class Conexion {
    protected Connection conexion;
     private final  String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        private final  String URL_DB="jdbc:mysql://localhost/clientes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        
         private final  String User="root";
         private final  String Clave="Passw0rd";
         
         public void conectar() throws Exception
         {
             
             try{
                 Class.forName(JDBC_DRIVER);
           conexion=DriverManager.getConnection(URL_DB, User, Clave);
                 
             }catch(Exception e)
             {
                 throw e;
             }
         }
    
         public void cerrar() throws Exception
         {
             
             if(conexion !=null)
             {
                 
                 if(!conexion.isClosed()){
                     
                     conexion.close();
                 }
             }
         }
}
