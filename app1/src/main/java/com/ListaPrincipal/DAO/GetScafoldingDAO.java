
package com.ListaPrincipal.DAO;

import java.util.ArrayList;

public interface GetScafoldingDAO <T,K>{
    
    void GetAdd(T a);
    
    void GetDelete(T a);
    
    void GetEdit(T a);
    
    ArrayList GetAll();
    
    T GetOne (K id);
}
