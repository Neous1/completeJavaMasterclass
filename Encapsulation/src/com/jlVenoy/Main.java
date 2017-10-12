package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "Yvon";
//	    player.health = 20;
//	    player.weapon="Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 11;
//		player.health = 200; // this direct access to the player's class health, which is not ideal. that's because
//		//was declare as a public field.
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());


		EnhancedPlayer player = new EnhancedPlayer("Yvon", 75, "numchuck");
		System.out.println("Initial health is " + player.getHealth());
	}
}
