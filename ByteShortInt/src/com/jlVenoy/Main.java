package com.jlVenoy;

public class Main {

    public static void main(String[] args) {

//	// int has a width of 32, the "_" are only meant to make the int more readable.
//        int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//        int myTotal = (myMinValue/2);
//
//        System.out.println("myTotal = "+ myTotal +"\n");
//
//
//        //byte has a width of 8, ranges from -128 to 127
//        byte myByteValue = -128;
//        byte myNewByteValue = (byte)(myByteValue/2); // need to cast result to byte to resolve error
//        System.out.println("myNewByteVale = "+myNewByteValue);
//
//        //sort has a width of 16, range from -32768 to 32767
//        short myShortValue = 32767;
//        short myNewShortValue = (short)(myShortValue/2);
//
//        System.out.println("myNewShortValue =" + myNewShortValue);
//
//
//        //long has a width of 64 , ranges from -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807
//        long myLongValue = 9_223_372_036_854_775_807L;
//        long myNewLongValue = (myLongValue/2);
//
//        System.out.println("myNewLongValue = "+ myNewLongValue);
//
////        System.out.println(myMinValue);


        //challenge

//        1.Create a byte variable and set it to any valid byte number.
        byte myByteVar = -117;

        short myShortVar = 9;

        int myIntVar = 56499;


        long myLongVar= 50000 + 10 *(myByteVar + myShortVar + myIntVar);

        System.out.println(myLongVar);

    }
}
