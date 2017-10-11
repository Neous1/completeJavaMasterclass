package com.jlVenoy;

public class Car {
    //state of the class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //create a method to make state accessible

    public void setModel(String model) {
        //use keyword "this" to refer to the field of the class
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

}
