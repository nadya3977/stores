package com.company;

import java.util.Arrays;

public class Store {
    public String name;
    public String[] products;

    public Store(String name) {
        this.name = name;
        this.products = new String[2];
    }

    public static Store[] addStore(String name, Store[] stores){

     Integer arrayLenghth=stores.length;

     if (stores[arrayLenghth-1] != null) { stores=arrayResize(stores); arrayLenghth=stores.length; }

     for (int i=0; i<arrayLenghth;i++) {
         if (stores[i]!=null) { if (stores[i].name.equals(name)) {System.out.println("Store already exist"); return stores;}}
         if (stores[i]==null) {

             stores[i] = new Store(name);
             break;}
     }

     return stores;
    }

    public static Store[]  deleteStore(String name, Store[] stores){

        for (int i=0;i<stores.length;i++) {
            if (stores[i]==null) {System.out.println("Wrong name, can't delete"); return stores;}
            if (stores[i].name.equals(name)) { return arrayReshuffle(i,stores);}
        }

        System.out.println("Wrong name, can't delete");
        return stores;

    }

    public static Store[] viewStore(String name, Store[] stores) {

        for (int i=0;i<stores.length;i++) {
            if (stores[i] == null) {
                System.out.println("Wrong name, can't view this store");
                return stores;
            }
            if (stores[i].name.equals(name)) {

                Console.productCommands();

                String action = Console.read();

                while (!action.equals("4")) {

                    if (action.equals("4")) break;
                    switch (action) {

                        // add store
                        case "1":
                            System.out.println("Enter product name");
                            String prodName = Console.read();
                            stores[i].products = Product.addNewProduct(prodName, stores[i].products);
                            System.out.println(stores[i]);
                            break;
// delete store
                        case "2":
                            if (stores[i].products[0] == null) {
                                System.out.println("No products to delete");
                                break;
                            }
                            System.out.println(stores[i]);
                            System.out.println("Enter product name from above you want to delete");
                            String name2 = Console.read();
                            stores[i].products = Product.deleteProduct(name2, stores[i].products);
                            System.out.println(stores[i]);
                            break;

                        default:
                            System.out.println(stores[i]);
                            System.out.println("Incorrect value");
                            break;



                    }

                    Console.productCommands();
                    action = Console.read();
                }
            }
        }

        return stores;
    }

    public static Store[] arrayResize(Store[] stores){

        int arrLength=stores.length;
        Store[] temp= new Store[arrLength*2];

        for (int i=0;i<arrLength;i++){
            temp[i]=stores[i];
        }
        return temp;
    }

    public static Store[] arrayReshuffle(int arrayIndex,Store[] stores){

        for (int i=arrayIndex;i<stores.length-1;i++){
            stores[i]=stores[i+1];
        }

        stores[stores.length-1]=null;
        return stores;
    }

    public static void printStores(Store[] stores){
        System.out.println("Stores array size "+ stores.length  );
        for (int i=0;i<stores.length;i++){
            if(stores[i]!=null) System.out.println(stores[i]);
            else {
                System.out.println("\t array current size " + i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "\t" + name + "\n"+
                "\t\t" + Arrays.toString(products);
    }
}
