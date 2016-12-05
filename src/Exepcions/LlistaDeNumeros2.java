/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepcions;

import java.io.*;

import java.util.List;

import java.util.ArrayList;

public class LlistaDeNumeros2 {

    private List<Integer> list;
 
    private static final int SIZE = 10; 
    private int i;

    public LlistaDeNumeros2 () {

            
        list = new ArrayList<Integer>(SIZE);
        

        for (int i = 0; i < SIZE; i++) {
                
            }
            list.add(new Integer(i));

        }

    }

    public void writeList(String fileName) {

        PrintWriter out = new PrintWriter(new FileWriter(fileName));

        try {

        for (int i = 0; i < SIZE; i++) {

            
            out.println("Value at: " + i + " = " + list.get(i));

        }
                
        out.close();

        }
catch (ArrayIndexOutOfBoundsException e) {
    System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
    }

    }
        

    public void readList(String fileName) {

        String line = null;

        RandomAccessFile raf = new RandomAccessFile(fileName, "r");

        while ((line = raf.readLine()) != null) {

            Integer i = new Integer(Integer.parseInt(line));

            System.out.println(i); list.add(i);

        }
        raf.close(); 
    }
    
