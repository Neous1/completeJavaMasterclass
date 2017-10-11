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

//        Account bobsAccount = new Account();
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);

//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println("Account #: " + timsAccount.getNumber()+ " name: "+ timsAccount.getCustomerName());
//        System.out.println("37 . Current balance is "+ timsAccount.getBalance());
//        timsAccount.withdrawal(100.55);


        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 2500.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
    }






}
