package com.mybfcalc.app;

/**
 * Calculation board feet
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Board board = new Board();
        Calc calc =  new Calc(board.w, board.t, board.l);

        System.out.println("Total Board Feet = " + calc.getBoardFeet());
    }
}
