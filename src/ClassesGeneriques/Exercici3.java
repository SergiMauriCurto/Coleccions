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
public class Exercici3 {
    
     public static void main(String[] args) {
         
    class Bicycle implements Comparable<Bicycle>{
 
    @Override
    public int compareTo(Bicycle o) {
        return this.cadence-o.cadence;    //To change body of generated methods, choose Tools | Templates.
    }
     
    int cadence = 0;
    int speed = 0;
    int gear = 1;
 
    void changeCadence(int newValue) {
         cadence = newValue;
    }
 
    void changeGear(int newValue) {
         gear = newValue;
    }
 
    void speedUp(int increment) {
         speed = speed + increment;   
    }
 
    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
 
    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
     
}
}
}