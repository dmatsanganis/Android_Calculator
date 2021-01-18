package com.dmatsanganis.calculator.Operations;

/**
 * Perform the Subtract operation.
 */

public class Subtract {

    /**
     * Implementing the operate method of the Operations Interface
     */

    public String operate(int argumentOne,int argumentTwo)
    {
        int difference=argumentOne-argumentTwo;

        /**
         * Converting the int difference to String for returning.
         */

        return Integer.toString(difference);
    }
}
