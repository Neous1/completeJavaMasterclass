package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score =  800;
        int levelCompleted = 5;
        int bonus = 100;
        System.out.println("---------------");

        calculateScore();



        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+ finalScore);
        }
    }


    public static void calculateScore(){
        boolean gameOver = true;
        int score =  800;
        int levelCompleted = 5;
        int bonus = 100;
        System.out.println("---------------");


        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was "+ finalScore);
        }
    }
}
