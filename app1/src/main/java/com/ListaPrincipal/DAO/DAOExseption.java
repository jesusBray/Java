
package com.ListaPrincipal.DAO;

public class DAOExseption extends Exception{

    public DAOExseption(String message) {
        super(message);
    }

    public DAOExseption(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOExseption(Throwable cause) {
        super(cause);
    }
    
}
