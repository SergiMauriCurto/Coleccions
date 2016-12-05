/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercici7 {
    
    public static void main(String[] args) {
    
    Scanner ent=new Scanner(System.in);
        String text;
         
        System.out.println("Introduix un text acabat en INTRO:");
        text=ent.nextLine();
         
        Pattern patro=Pattern.compile("\\b\\w\\S*@\\S+\\.\\S+");
        Matcher matcher=patro.matcher(text);
        while(matcher.find()) System.out.println(matcher.group());
    }
}
