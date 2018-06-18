package com.company;

public class Main {

    public static void main(String[] args) {


        String[] stores = new String[2];

        Console.printCommands();
        String action = Console.read();

        while (!action.equals("4")) {

            if (action.equals("4")) break;
            switch (action) {

                // add store
                case "1":
                    System.out.println("Enter store name");
                    String name = Console.read();
                    stores = Store.addStore(name, stores);
                    Store.printStores(stores);
                    break;
// delete store
                case "2":
                    if (stores[0]==null) {System.out.println("No stores to delete"); break;}
                    Store.printStores(stores);
                    System.out.println("Enter store name from above you want to delete");
                    String name2 = Console.read();
                    stores = Store.deleteStore(name2, stores);
                    Store.printStores(stores);
                    break;

                //         view store
                case "3":

                    if (stores[0]==null) {System.out.println("No stores to view"); break;}
                    Store.printStores(stores);
                    System.out.println("Enter store name from above you want to view");
                    String name3 = Console.read();


                    Store.printStores(stores);
                    break;

                case "4":
                    Store.printStores(stores);
                    break;


                default:
                    Store.printStores(stores);
                    System.out.println("Incorrect value");
                    break;


            }
            // write your code here

            Console.printCommands();
            action = Console.read();
        }

    }



}
