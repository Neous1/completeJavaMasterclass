package com.jlVenoy;

public class DeluxeBurger extends Hamburger {
    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
    //  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
    // plus all additionals, each showing the addition name, and addition price, and a grand total for the
    // burger
    // For the two additional classes this may require you to be looking at the base class for pricing and then
    // adding totals onto that.

    public DeluxeBurger() {
        super("Deluxe","Sausage & Bacon", 14.54, "white");

        //Add the additions at the time the items are created.
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 3.25);
    }

    //prevent other additions being made with a method override


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to  deluxe burger ");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to  deluxe burger ");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to  deluxe burger ");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to  deluxe burger ");
    }
}
