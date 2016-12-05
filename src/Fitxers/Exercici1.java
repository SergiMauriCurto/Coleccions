/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitxers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Exercici1 {
    
    public static void main() {
        
        final String nomFich="fitxer1.txt";
        Scanner in = null;
        try {
            in = new Scanner (new FileReader(nomFich));
            in.useLocale(Locale.ENGLISH);
            while (in.hasNext()) {
                String palabra = in.next();
                System.out.println("Palabra:" + palabra);
                while (in.hasNextDouble()) {
                 double d = in.nextDouble();  
                 System.out.println("Numero:"+d);
                }
            }
                
        } catch (FileNotFoundException e) {
            System.out.println("Error abriendo el fichero"+nomFich);
        } finally {
            if (in!=null) {
                in.close();
            }
        }
    }
}
