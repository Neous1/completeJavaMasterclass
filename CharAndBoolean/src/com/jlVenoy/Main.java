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
    }
}
//00AE