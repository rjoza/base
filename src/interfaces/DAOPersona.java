/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.Persona;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ronny.joza
 */
public interface DAOPersona {
    
    public int registrar(Persona per);
    public ArrayList<Persona> listar() throws Exception;
}
