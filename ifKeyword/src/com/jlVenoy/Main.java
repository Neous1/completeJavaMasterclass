package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        System.out.println("---------------");

//                if(score<5000 && score > 1000){
//
//                    System.out.println("Your score was lt 5000 but gt 1000");
//                }else if (score < 1000){
//                    System.out.println("Your score was lt 1000");
//
//                }else {
//            System.out.println("Got here");
//        }
//
//

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+ finalScore);
        }



        System.out.println("------Challenge time---------");

        /*
        * Print out a second score on the screen with the following
        * score set to 10000
        * levelCompleted set to 8
        * bonus set to 200
        * but make sure the first printout above still displays as well
        *
        * */

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
