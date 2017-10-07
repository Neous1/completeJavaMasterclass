package com.jlVenoy;

public class Main {

    public static void main(String[] args) {

	// int has a width of 32, the "_" are only meant to make the int more readable.
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);


        //byte has a width of 8, ranges from -128 to 127
        byte myByteValue = 127;
        byte myNewByteValue = (byte)(myByteValue/2); // need to cast result to byte to resolve error

        //sort has a width of 16, range from -32768 to 32767
        short myShortValue = 32767;


        //long has a width of 64 , ranges from -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807
        long myLongvalue = 9_223_372_036_854_775_807L;

        System.out.println(myMinValue);
    }
}
