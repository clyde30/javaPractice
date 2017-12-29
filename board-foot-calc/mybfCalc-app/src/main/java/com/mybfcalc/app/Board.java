package com.mybfcalc.app;

import java.util.Scanner;

public class Board {
    Float w;
    Float t;
    Float l;        
    public Board() {
        this.getDimensions();
    }
    public void getDimensions() {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter width:");
        w = user_input.nextFloat();

        System.out.print("Enter thickness:");
        t = user_input.nextFloat();

        System.out.print("Enter length:");
        l = user_input.nextFloat();
    }
}