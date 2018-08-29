
package com.ListaPrincipal.DAO;

import java.util.ArrayList;

public interface ScafoldingDAO <T,K> {
    
    void Adicionar(T a)throws DAOExseption;
    
    void Eliminar(T a)throws DAOExseption;
    
    void Modificar(T a)throws DAOExseption;
    
    ArrayList ObtenerTodo()throws DAOExseption;
    
    T Obtener(K id)throws DAOExseption;
    
}
