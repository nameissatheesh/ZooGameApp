/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo05group;

/**
 * This is Rabbit class which extends Animal class
 *
 * @author Keerthana Ragut
 */
public class Rabbit extends Animal {

    /**
     *
     * @param name of the Rabbit
     */
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I'm a Rabbit!");
    }

    @Override
    public void move() {
        System.out.println("I hop");
    }

    //@Override
    public void favfood() {
        System.out.println("I Love eating Clover!!");
    }

    //@Override
    public void skintype() {
        System.out.println("I am very soft and fur");
    }

    //@Override
    public void color() {
        System.out.println("I can be White or Brown!!");
    }

   
    //catching exceptions
    public void caladd() {
        try{
        double m = 4.0;
        int n = 2;
        double o = getRabbitAddition(m, n);
        System.out.printf("I know RabbitAddition! %4.2f plus %d is %4.2f \n", m, n, o);
        }catch (ArithmeticException  e){
            System.out.println("Exception thrown   :" + e);
        }
        finally{
        System.out.println("error defined in addition");
        }
    }

    public void calsub() {
        try{
        double m = 6.0;
        int n = 2;
        double o = getRabbitSubstraction(m, n);
        System.out.printf("I know RabbitSubstraction! %4.2f plus %d is %4.2f \n", m, n, o);
        }catch (ArithmeticException  e){
            System.out.println("Exception thrown   :" + e);
        }
        finally{
        System.out.println("error defined in substraction");
        }
    }
      public void caldivision() {
        try{
        int m = 6;
        int n = 0;
        int o = getRabbitdivision(m, n);
        System.out.printf("I know Rabbitdivision!");
        }catch (ArithmeticException  e){
            System.out.println("Exception thrown   :" + e);
        }
        finally{
        System.out.println("error defined in division");
        }
    }
    
    public double getRabbitAddition(double m, int n) {

        return m + n;
    }
    public double getRabbitSubstraction(double m, int n) {

        return m - n;
    }
    public int getRabbitdivision(int m, int n) {

        return m/n;
    }

    /**
     * Enum function with FOODHabits values
     *
     */
    public enum FoodHabits {
        CARNIVORES,
        HERBIVORES,
        OMNIVORES,
        OTHERS;

    }

    public static void main(String[] args) {
        var par = new Rabbit("Keerthana");
        par.speak();
        par.move();
        par.favfood();
        par.skintype();
        par.color();
        //par.cal();
        par.caladd();
        par.calsub();
        par.caldivision();
         for (FoodHabits foodhabit : FoodHabits.values()) {
            System.out.println(foodhabit);
        }

    }
}
