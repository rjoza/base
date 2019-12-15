/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bd.Persona;
import interfaces.DAOPersona;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronny.joza
 */
public class DaoPersonaImp extends Conexion implements DAOPersona{

    @Override
    public int registrar(Persona per){
         int rs = 0; 
       try
         
       {
           this.conectar();
           PreparedStatement st = this.conexion.prepareStatement("INSERT INTO personas (nombre,apellido)" + "values(?,?)");
            st.setString(1, per.getNombre());
              st.setString(2, per.getApellido());
               rs = st.executeUpdate();
       }catch(Exception e){
           try {
               throw e;
           } catch (Exception ex) {
               Logger.getLogger(DaoPersonaImp.class.getName()).log(Level.SEVERE, null, ex);
           }
       }finally{
        
           try {
               this.cerrar();
           } catch (Exception ex) {
               Logger.getLogger(DaoPersonaImp.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
       return rs;
    }
    
    @Override
    public ArrayList<Persona> listar() throws Exception
    {
        ArrayList<Persona> lista=null;
        try{
            
            this.conectar();
            PreparedStatement st=this.conexion.prepareStatement("SELECT * FROM PERSONAS");
            lista=new ArrayList();
            
            ResultSet rs= st.executeQuery();
            
            while(rs.next())
            {
                
                Persona per = new Persona();
                per.setId(rs.getInt("idPersona"));
                per.setNombre(rs.getString("nombre"));
                per.setApellido(rs.getString("apellido"));
                lista.add(per);
                //rs.close();
                //st.close();
            }
        }catch(Exception e)
        {
            throw e;
        }
        return lista;
    }
    
}
