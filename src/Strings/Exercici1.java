/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

public class Exercici1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        //1. Fes un programa que llisquigue un número real com a paràmetre del programa i mostre quants decimals té.
        
       if(args.length<1) System.out.println("Número de paràmetres incorrecte!!");
        else{
            int punt=args[0].indexOf('.');
            try{
                float f=Float.valueOf(args[0]);
                System.out.println("El número té "+(args[0].length()-punt-1)+" decimals.");
            }catch(java.lang.NumberFormatException e){
                System.out.println("El paràmetre no representa un número real!!");
            }
        }
}
}