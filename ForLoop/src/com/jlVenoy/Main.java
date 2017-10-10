package com.jlVenoy;

public class Main {

    /*
    * challenge
    * Using the for statement , call the calculateInterest method with
    * the amount of 10000 with an interestRate of 2,3,4, 5,6,7 and 8
    * and print the results to the console window
    * */
    public static void main(String[] args) {

        for (int i = 2; i <9; i++)

        System.out.println("10,000 at "+i+"% interest = " +
                String.format("%.2f", calculateInterest(10000,i)));


    /*
    How would you modify the for loop above to do ht seam thing as
    shown but to start from 8% and work back to 2%
     */
        System.out.println("_---------------------_");
        for(int i = 8; i > 1 ; i--)

            System.out.println("Reverse printout : 10,000 at "+i+"% interest = " +
                    String.format("%.2f", calculateInterest(10000,i)));
    }




    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
