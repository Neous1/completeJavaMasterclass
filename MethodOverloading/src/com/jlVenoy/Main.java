package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------");
        int newScore = calculateScore("Yvon", 40);
        System.out.println("New score is " + newScore);
        calculateScore(75);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " +playerName+ " scored "+ score+ " points");
        return score * 1000;
    }

    //overload the method mby changing the number of parameters
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+ score+ " points");
        return score * 1000;
    }
}
