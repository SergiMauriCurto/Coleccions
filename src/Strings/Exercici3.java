/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercici3 {
    
    public static void main(String[] args) {
        
        Scanner ent=new Scanner(System.in);
        String text;
        StringBuilder revers;
        Pattern pattern=Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\s\\p{Punct}]");
        //Pattern pattern=Pattern.compile("[\\P{ASCII}\\W\\s]");  // Tot el que no sigue una lletra de la taula ASCII, o no sigue un signe per formar noms, o sigue espais en blanc
                                                                //http://www.regular-expressions.info/unicode.html
                                                                //http://www.v3rgu1.com/blog/231/2010/programacion/eliminar-acentos-y-caracteres-especiales-en-java/
 
        System.out.println("Introduix un text acabat en INTRO:");
        text=ent.nextLine().toLowerCase();
        text=Normalizer.normalize(text, Normalizer.Form.NFD);
        System.out.println(text);
        text=pattern.matcher(text).replaceAll("");
        System.out.println(text);
        revers=new StringBuilder(text);
        if(text.equals(revers.reverse().toString())) System.out.println("Palíndrom!!");
        else System.out.println("No palíndrom!!");
    }
}
