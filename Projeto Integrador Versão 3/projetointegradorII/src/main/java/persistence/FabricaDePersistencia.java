/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.List;

public interface FabricaDePersistencia<T> {
    public void salvar(T item);
    public void remover(T item);
    public List<T> buscar();
}
   
