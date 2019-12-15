/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ronny.joza
 */
public class conexion {
    
     
   public  static Connection conectar(){
       
        Connection con = null;
                String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String URL_DB="jdbc:mysql://localhost/clientes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        
         String User="root";
         String Clave="Passw0rd";
            try{
               
           Class.forName(JDBC_DRIVER);
           con=DriverManager.getConnection(URL_DB, User, Clave);
           System.out.println("Se conectó");
        }catch(Exception e)
        {
            System.out.println("Error en la conexión, verifique, su usuario y password o el nombre de la base a la que intenta conectarse");
	    e.printStackTrace();
            //e.getMessage();
        }
       return con; 
   }   
    /*
   public void desconectar()
            
    {
        try {
            con.close();
            System.out.println("Se desconectó");
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrar la conexion");
        }
        
    }*/
    /*
    public static void main(String args[])
            
    {
        conexion cn = new conexion();
        cn.conectar();
        cn.desconectar();
        
    }
*/
   }
    
