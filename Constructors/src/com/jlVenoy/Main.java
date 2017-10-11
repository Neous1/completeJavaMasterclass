package com.jlVenoy;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.


        //call constructor by adding parameters to the new class
//        Account bobsAccount = new Account("12345", 0, "Bob Brown",
//                "myemail@bob.com", "(555)123-1212");
//
//
        //set constructor to empty to call the overloaded constructor

        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);
    }
}
