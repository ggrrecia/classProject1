package app;

import machine.Register;
import food.*;
import machine.Register;
import transactions.Payment;


public class Controller {

    public static void main(String[]args){

        yourInfoHeader();

        Register register = new Register(15,20,10,20,50);
        System.out.println(register);

        register.cashInfo("Manager");
        register.cashInfo("Staff");

        Apple grannySmith = new Apple("Granny Smith", 1.51,140);
        grannySmith.displayInfo();

        Payment applePayment1 = new Payment(10,0,0,0,47);
        applePayment1.displayInfo();

        register.buyApple(grannySmith, applePayment1);
        register.cashInfo("Manager");

        Apple macintosh = new Apple("Macintosh",1.70,150);
        macintosh.displayInfo();

        Payment applePayment2 = new Payment(0,2,0,0,0);
        applePayment2.displayInfo();

        register.buyApple(macintosh, applePayment2);
        register.cashInfo("Manager");

        Sandwich sandwich = new Sandwich("White",true, true,true);
        sandwich.displayInfo();

        Payment sandwichPayment1 = new Payment(5,2,1,1,2);
        sandwichPayment1.displayInfo();

        register.buySandwich(sandwich, sandwichPayment1);
        register.cashInfo("Manager");

        boolean meat= true;
        boolean cheese= false;
        boolean veggies= false;
        System.out.println("");

        Payment sandwichPayment = new Payment(10,0,0,0,0);

        for(int i = 1; i<=8; i++){
            System.out.println("==========================================");
            System.out.println("==========================================");
            if (i <=4){
                meat = true;
            }else{
                meat = false;
            }
            if(i%2!=0){
                cheese = !cheese;
            }
            veggies = !veggies;

            Sandwich sandwiches =new Sandwich(meat,cheese, veggies);
            sandwiches.displayInfo();
            sandwichPayment.displayInfo();
            register.buySandwich(sandwiches, sandwichPayment);
            register.cashInfo("Manager");
            System.out.println("==========================================");
            System.out.println("==========================================");

        }







    }

    public static void yourInfoHeader(){
        System.out.println("===============================================");
        System.out.println("COP 2210 - Project 1 Output");
        System.out.println("Grecia Lara");
        System.out.println("6236370");
        System.out.println("U021228");
        System.out.println("===============================================");
        System.out.println("\n");

        /*System.out.println("============================================");
        System.out.println("PROGRAMMER: " + "Grecia");
        System.out.println("PANTHER ID: " + "6236370");
        System.out.println();
        System.out.println("Class: \t\t COP2210");
        System.out.println("SECTION: \t " + "U021228");
        System.out.println("SEMESTER: \t " + "Fall 2022");
        System.out.println("CLASSTIME: \t " + "6:25pm-9:05pm");
        System.out.println();
        System.out.println("COP 2210 " + "PROJECT 1");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of another person");
        System.out.println("============================================");
         */

    }//end yourInfoHeader




}
