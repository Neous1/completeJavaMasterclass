package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
	// width of 16 (2 bytes)
        char myChar = '\u00A9';

        System.out.println("unicode output was: "+myChar);

        boolean myBoolean = false;
        boolean isMale = true;


        // Challenge
        //https://unicode-table.com/en/#greek-coptic.
        //1.Find the code for the registered symbol on teh same line as the copyright symbol.
        //2. Create a variable of type char and assign it tohe unicode value for that symbole.
        //3. Display it on screen.

        char registeredSymbol = '\u00AE';
        System.out.println("registered Symbol is "+registeredSymbol);



        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("myString is equal to "+ myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("my String is equal to "+myString);

        String numberString = "250.55";
        numberString = numberString + 49.95;
        System.out.println("The result is "+ numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: "+lastString);

    }
}
//00AE