package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
     //create an object and initialize with "new" keyword
     Car porsche = new Car();
     Car holden = new Car();
     porsche.setModel("Carrera");
        System.out.println("Model is "+porsche.getModel());
    }
}
