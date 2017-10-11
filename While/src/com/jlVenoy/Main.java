package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int count =1;
//        while (count !=6){
//            System.out.println("Count value is "+ count);
//            count ++;
//        }
//
//        for (int i = 1; i<7; i++){
//            System.out.println("Count value on ForLoop "+ count);
//
//        }
//
//        count = 1;
//        while (true){
//            if(count == 5){
//                break;
//            }
//            System.out.println("cont value on whletrue "+count);
//            count++;
//        }
//
//        count = 1;
//        do{
//            System.out.println("Do while count value  was "+ count);
//            count++;
//        }while (count !=6);
//    }
        //challenges
        /*Create a method called isEvenNumber that takes a parameter of type int
        * Its purpose s to determine if the argument passed to the method is an even number or not .
        * return true if a even number , otherwise return false
        * */

        isEvenNumber(6);
    }


    public static int isEvenNumber(int a) {
        while (a > 0) {
            if (a % 2 == 0) {
                System.out.println(a + " is an even number");
                break;
            } else {
                System.out.println(a + " is not an even number");
                break;
            }

        }
        return a;

    }
}