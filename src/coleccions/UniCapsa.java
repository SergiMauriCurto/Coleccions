/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions;

/**
 *
 * @author alumne
 * @param <O>
 */
public class UniCapsa<O> {
    
    protected O obj;
    
    public boolean afegir(O obj) {
        if (!esPlena()) {
            this.obj = obj;
            return true;
        }
        
        return false;
    }
        
    public boolean esPlena() {
        return obj != null;
    }
    
    public O obtenir() {
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
