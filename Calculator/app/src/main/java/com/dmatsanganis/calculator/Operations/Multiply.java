package com.dmatsanganis.calculator.Operations;

/**
 * Perform the Multiply operation.
 */

public class Multiply {

    /**
     * Implementing the operate method of the Operations Interface
     */

    public String operate(int argumentOne,int argumentTwo)
    {
        int product=argumentOne*argumentTwo;

        /**
         * Converting the int product to String for returning.
         */

        return Integer.toString(product);
    }

}
