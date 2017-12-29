package com.mybfcalc.app;

public class Calc {
        Float w;
        Float t;
        Float l;

    public Calc(Float width, Float thickness, Float length) {
        this.w = width;
        this.t = thickness;
        this.l = length;
    }

    public Float getBoardFeet() {
        
        return (w * t * l)/12;
    }

}