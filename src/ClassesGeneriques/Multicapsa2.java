/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesGeneriques;

/**
 *
 * @author alumne
 */
public class Multicapsa2<E> {
    
    protected E obj;
    private Object object;
    
    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
        
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
