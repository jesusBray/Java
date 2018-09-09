
package exapleinterfaces.DAO;

import java.util.ArrayList;

public interface DAO<T, K> {
    
    void adicionarDatod(T adicionar);
    
    void eliminardatos(T eliminar);
    
    void modificar(T dato1);
    
    ArrayList Listar(T datos);
    
    T obtener(K id);
}
