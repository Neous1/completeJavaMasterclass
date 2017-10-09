package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score =  1000;
        int levelCompleted = 8;
        int bonus = 200;
        System.out.println("---------------");


        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was "+ finalScore);
        }


        gameOver = true;
        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+ finalScore);
        }
    }


}
