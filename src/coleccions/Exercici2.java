/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercici2 {
    
    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        Map<String,Integer> funcio=new TreeMap<>();
         
        String text="", linia;
        System.out.println("Introduix una o més línies de text (línia buida per acabar):");
        do {            
            linia=ent.nextLine();
            text+="\n"+linia;
        } while (!linia.isEmpty());
         
        String[] paraules=text.trim().split("[\\s\\p{Punct}\\p{Cntrl}]+");
         
        for(String s:paraules){
            if(funcio.containsKey(s)) funcio.put(s, funcio.get(s)+1);
            else funcio.put(s, 1);
        }
         
        for(String key:funcio.keySet())
            System.out.println(key+": "+funcio.get(key));
    }
}
