
package model.interfaces;

import java.util.List;

/**
 *
 * @author Adrielly Sales
 */
public interface Dao<T> {
    void cadastrar(T t);
    void alterar(T t);
    T recuperar(int codigo);
    void deletar(T t);
    List<T> recuperarTodos();
}
