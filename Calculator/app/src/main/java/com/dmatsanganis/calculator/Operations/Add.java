package com.dmatsanganis.calculator.Operations;

/**
 * Perform the Add operation.
 */

public class Add {
    // TODO - add your solution here.

    public String operate(int argumentOne,int argumentTwo) {
        int sum = argumentOne + argumentTwo;

        /**
         * Converting the int sum to String for returning.
         */

        return Integer.toString(sum);
    }
}
