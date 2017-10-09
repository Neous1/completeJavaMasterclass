package com.jlVenoy;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5,100);

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        System.out.println("---------------");

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
