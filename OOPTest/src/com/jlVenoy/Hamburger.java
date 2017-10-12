package com.jlVenoy;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

//track additional ingredient to burger and their cost
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
}
