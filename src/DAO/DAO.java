/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author EQUINOX
 */
public interface DAO <T>{
    public boolean insertar(T a);
    public boolean modificar(T a);
    public boolean eliminar(T a);
    public List<T> obtenerTodos();
    
}
