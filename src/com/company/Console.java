package com.company;

import java.util.Scanner;

public class Console {

    public static void printCommands(){

        System.out.println("Please choose an option what you want to do: ");
        System.out.println("1-Add store");
        System.out.println("2-Delete store");
        System.out.println("3-View store");
        System.out.println("4-Exit");

        //System.out.println("Please choose what you want to do: ");

    }
    public static void productCommands(){

        System.out.println("Please choose an option what you want to do: ");
        System.out.println("1-Add product and quantity");
        System.out.println("2-Delete product");
        System.out.println("3-Exit");

        //System.out.println("Please choose what you want to do: ");

    }






    public static String read(){

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        //scanner.close();
        return myString;
    }
}
