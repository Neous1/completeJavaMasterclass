package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------");
        int newScore = calculateScore("Yvon", 40);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        /*
        * Create a method called calcFeetAndInchesToCentimeters
        * It needs to have 2 parameters.
        * feet is the 1st parameter, inches is the 2nd parameter
        *
        * YOu should validate that the first parameter feet is >=0
        * You should validated that the 2nd parameter inches is >=0 ad <=12
        * return -1 from the method if either of the above is not true
        *
        * If the parameters are valid, then calculate how many centimeters
        * comprise the feet and inches  passed th this method anr return that value.
        *
        * Create a 2nd method of the same name but with only one parameter
        * inches is the parameter
        * validate that its >=0
        * return -1 if it is not true
        * But if its valid, then calculate how many feet are in the inches
        * and then here is the tricky part
        * call the other overloaded method passing eht correct feet adn inches calculated
        * so that it can calculate correctly.
        * hits: Use double for your number data types is probably a good idea
        * 1 inch = 2.54cm adn one foot = 12 inches
        * use the link I give you to confirm your code is calculating correctly.
        * Calling another overloaded method just requires you to use the right number of parameter
        * */




    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet >=0) {
            return 1;
        }else if(inches >=0 && inches <=12){
            return 2;
        }else
            return -1;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " +playerName+ " scored "+ score+ " points");
        return score * 1000;
    }

    //overload the method mby changing the number of parameters
    //overload method must have an unique signature
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+ score+ " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }



}
