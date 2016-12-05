/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

public class Exercici2 {
    
    public static void main(String[] args) {
    
    Scanner scn=new Scanner(System.in);        
        String text;
        char caracter;
         
        System.out.println("Introdueix un text acabat en INTRO:");
        text=scn.nextLine();
        //scn.next();
         
        System.out.println("Introdueix un caracter a buscar:");
        caracter=scn.nextLine().charAt(0);
         
        char resposta1;
        do {            
            System.out.println("Distingir majúscules i minúscules? (S/N):");
            resposta1=scn.nextLine().toUpperCase().charAt(0);
            if("SN".indexOf(resposta1)!=-1) break;
        } while (true);
        if (resposta1=='N') {
            text=text.toLowerCase();
            caracter=Character.toLowerCase(caracter);
        }
 
        char resposta2;
        do {            
            System.out.println("En quin ordre busco (1. esquerra a dreta, 2. dreta a esquerra)?:");
            resposta2=scn.nextLine().toUpperCase().charAt(0);
            if("12".indexOf(resposta2)!=-1) break;
        } while (true);
 
        System.out.println("Aparicions del caracter:");
        int posicio=(resposta2=='1'?text.indexOf(caracter, 0):text.lastIndexOf(caracter, text.length()));
        while(posicio!=-1){
            System.out.println("El caracter apareix a la posició "+posicio);
            posicio=(resposta2=='1'?text.indexOf(caracter, posicio+1):text.lastIndexOf(caracter, posicio-1));
        }
}
}