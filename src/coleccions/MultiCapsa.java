/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions;

/**
 *
 * @author alumne
 * @param <E>
 */
public class MultiCapsa<E> {
    
    protected E obj;
    
    public boolean afegir(E obj) {
        if (!esPlena()) {
            this.obj = obj;
            return true;
        }
        
        return false;
    }
        
    public boolean esPlena() {
        return obj != null;
    }
    
    public E obtenir() {
        if(esPlena()) {
            return obj;
        }
        return null;
    }
    
    public boolean buidar() {
        if(esPlena()) {
            this.obj = null;
            return true;
        }
        return false;
    }
}

