package com.jlVenoy;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4 bytes).
	int myIntValue = 5/3;

	//width of float = 32 (4 bytes).
	float myFloatValue = 5f/3f;

	//width of double = 64 (3 bytes)
	double myDoubleValue = 5d/3d;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue +"\n");



    //convert a given number of pounds to  kilograms
        //1. Create a variable to store the number of poinds
        //2. Calculate the number of Kilograms for the number above and store in a variable.
        //3. Print out the result.

        //Notes: 1 pound is equal to 0.45359237 kilograms



        double kil = 0.45_359_237d;

        double lbs = 200d;

        double converted = kil * lbs;

        System.out.println("converted lbs = "+ converted);


    }
}
