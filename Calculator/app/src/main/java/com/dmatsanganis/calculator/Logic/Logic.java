package com.dmatsanganis.calculator.Logic;

import java.util.HashMap;

import com.dmatsanganis.calculator.Operations.Add;
import com.dmatsanganis.calculator.Operations.Divide;
import com.dmatsanganis.calculator.Operations.Multiply;
import com.dmatsanganis.calculator.Operations.Subtract;
import com.dmatsanganis.calculator.UI.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */

public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */

    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */

    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    public void process(int argumentOne, int argumentTwo, int operation) {

        if(operation==ADDITION) {
            Add add_object = new Add();                                     // Making the object of the Add class
            mOut.print(add_object.operate(argumentOne, argumentTwo));        // Printing the value returned by the operate function.
        }
        else if(operation==SUBTRACTION) {
            Subtract subtract_object = new Subtract();                      // Making the object of the Subtract class
            mOut.print(subtract_object.operate(argumentOne, argumentTwo));   // Printing the value returned by the operate function.
        }
        else if(operation==MULTIPLICATION) {
            Multiply multiply_object = new Multiply();                      // Making the object of the Multiply class
            mOut.print(multiply_object.operate(argumentOne, argumentTwo));   // Printing the value returned by the operate function.
        }
        else if(operation==DIVISION) {
            Divide divide_object = new Divide();                            // Making the object of the Divide class
            mOut.print(divide_object.operate(argumentOne, argumentTwo));     // Printing the value returned by the operate function.
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
