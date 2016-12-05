/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

public class Exercici6 {
    
    public static void main(String[] args) {
    
    Scanner ent=new Scanner(System.in);
        String text1, text2;
         
        System.out.println("Introduix un text no buit:");
        do{
            text1=ent.nextLine().toLowerCase().trim();
        }while(text1.isEmpty());
         
        System.out.println("Introduix un altre text no buit:");
        do{
            text2=ent.nextLine().toLowerCase().trim();
        }while(text2.isEmpty());
         
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<text1.length();i++){        
            if(Character.isLetter(text1.charAt(i))) sb.append(text1.charAt(i));        
        }
         
        text1=sb.toString();
 
        sb=new StringBuilder();
        for(int i=0; i<text2.length();i++){        
            if(Character.isLetter(text2.charAt(i))) sb.append(text2.charAt(i));        
        }
         
        text2=sb.toString();
         
        char[] aText1=text1.toCharArray();
        Arrays.sort(aText1);
         
        char[] aText2=text2.toCharArray();
        Arrays.sort(aText2);
         
        if(Arrays.equals(aText1, aText2)) System.out.println("Anagrama!!");
        else System.out.println("No anagrama!!");
        
    }
}
