package com.kano.diceroller;

import java.util.Calendar;

public class Demo {
    public static void main(String []args){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        print(year);

    }
    public static void print(String display){
        System.out.println(display);
    }
    public static void print(int display){
        System.out.println(display);
    }
    public void print(double display){
        System.out.println(display);
    }
}
