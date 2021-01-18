## Calculator App

### Project Overview and Requirements

In this project assignment you’ll write the program logic needed to complete a simple
calculator app in Java. 
This app will perform integer arithmetic on values entered via
components defined using Android’s user interface (or UI). We’ll supply you with skeleton
code that implements the calculator’s UI in Android. The app you implement should meet
the following requirements:

- • The UI we provide allows the user to enter two integer values and to select one of four
operations: addition, subtraction, multiplication, or division.
- • After supplying the two integer values and pressing the “CALCULATE” button on the UI,
three entities will be provided to the Java code you write: the two integer values
entered by the user and the operation they selected to perform on these values.
- • Your code must then perform the necessary computation and print a string that
contains the final answer in the expected form. out.print(String) is how you will display
the results to the App’s screen.
- • The final results printed for integer addition, subtraction, and multiplication are what
you’d expect them to be.
Performing addition Performing subtraction Performing multiplication
- • The final result printed for integer division must include both the quotient and the
remainder (even if the remainder is zero).
- • There is a special-case that you must handle with division. When the value 0 is entered
in the “Value Two” box on the screen, you must not perform that calculation because an
exception will be thrown, which will crash your App. Your code should therefore check
to prevent that and instead send a text string to the screen warning of division by 0. The
exact text to convey this is up to you, but it should be both clear and concise.
