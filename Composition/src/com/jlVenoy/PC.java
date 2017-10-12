package com.jlVenoy;

public class PC { // we'll not use the extends , as it limits one to only one class
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    public void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

//
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
