/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesGeneriques;

/**
 *
 * @author alumne
 * @param <E>
 */
public class MultiCapsa<E> {
    
    protected E obj;
        
    public boolean esBuida() {
        if(esBuida()) {
            return true;
        }
        return false;
    }
    
    public E obtenir() {
        if(!esBuida()) {
            return obj;
        }
        return null;
    }
    
    public boolean buidar() {
        if(esBuida()) {
            this.obj = null;
            return true;
        }
        return false;
    }
}

