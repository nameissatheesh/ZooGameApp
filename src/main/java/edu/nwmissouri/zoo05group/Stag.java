/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo05group;

/**
 * This is the Stag class which extends Animal
 * @author Rahul Konda
 */
public class Stag extends Animal{
    
    /**
     * Stag Constructor
     * @param name - the name of this Stag
     */
    public Stag(String name){
        super(name);
    }
     //@Override
    public void eat(){
        System.out.println("I'm CARNIVOROUS, I eat grass.");
    }


    @Override
    public void speak(){
        System.out.println("I'm a STAG, I have LONG HORNS!");
    }
    @Override
    public void move() {
        System.out.println("When I feel SUSPICIOUS, I RUN very fast!");
    }
     //@Override
    public void color(){
        System.out.println("I'm brown in colour with white spots on me");
    }
    
    public void caladd() {
    try{
        double m = 4.0;
        int n = 2;
        double o = getStagAddition(m, n);
        System.out.printf("I know StagAddition! %4.2f plus %d is %4.2f \n", m, n, o);
        }
    catch (ArithmeticException e){
            System.out.println("Exception thrown :" + e);
        }
    finally {
            System.out.println("error defined in addition");
    }
    }
    
    public double getStagAddition(double m, int n) {
        return m + n;
    }
    
    public void calsub() {
    try{
        double m = 7.0;
        int n = 3;
        double o = getStagSubstraction(m, n);
        System.out.printf("I know StagSubstraction! %4.2f minus %d is %4.2f \n", m, n, o);
        }
    catch (ArithmeticException e){
            System.out.println("Exception thrown :" + e);
        }
    finally {
            System.out.println("error defined in substraction");
    }
    }
    
    public double getStagSubstraction(double m, int n) {
        return m - n;
    }
    
    public void caldiv() {
    try{
        int m = 8;
        int n = 0;
        int o = getStagdivision(m, n);
        System.out.printf("I know Stagdivision!");
        }
    catch (ArithmeticException e){
            System.out.println("Exception thrown :" + e);
        }
    finally {
            System.out.println("error defined in division");
    }
    }
    
    public int getStagdivision(int m, int n) {
        return m/n;
    }   
    
     /**
     * enum function with month values
     * 
     */
    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER;
    }
    
    /**
     * Main method to run Stag Class
     * @param args 
     */
    public static void main(String[] args) {
        var a = new Stag("Rahul");
        a.eat();
        a.speak();
        a.move();
        a.color();
        a.caladd();
        a.calsub();
        a.caldiv();
    }
}
