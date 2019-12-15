/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bd.Usuarios;

import interfaces.DAOUsuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronny.joza
 */
public class DaoUsuariosImpl extends Conexion implements DAOUsuarios {

    @Override
    public boolean validarUsuario(Usuarios usr) throws Exception
    {
        ResultSet rs;
        try{
            
       
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios where usuario = ? and clave = ?");
            st.setString(1, usr.getUsuario());
            st.setString(2, usr.getClave());
             rs= st.executeQuery();
              
         }catch(Exception e)
         {
             throw e;
         }finally{
            
            //this.cerrar();
        }
         return rs.next();    
       }
    
    
}
