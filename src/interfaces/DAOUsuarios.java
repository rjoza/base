/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import bd.Usuarios;

/**
 *
 * @author ronny.joza
 */
public interface DAOUsuarios {
    
    public boolean validarUsuario(Usuarios usr)throws Exception;
}
