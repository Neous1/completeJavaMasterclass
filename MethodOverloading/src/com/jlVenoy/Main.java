package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Yvon", 40);
        System.out.println("New score is " + newScore);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " +playerName+ " scored "+ score+ " points");
        return score * 1000;
    }
}
