package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int switchValue = 6;

        switch (switchValue){

            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;


            default:
                System.out.println("Was not 1 ,2,3,4 or 5");
                break;
        }

        System.out.println("--------------------");
        char letter ='f';

        switch (letter){
            case 'A':
                System.out.println("Letter is A");
                break;
            case 'B':
                System.out.println("Letter is B");
                break;
            case 'C':
                System.out.println("Letter is C");
                break;
            case 'D':
                System.out.println("Letter is D");
                break;
            case 'E':
                System.out.println("Letter is E");
                break;
            default:
                System.out.println("Letter was not A,B, C, D or E");
                break;
        }
    }
}

