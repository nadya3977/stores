package com.company;

public class Store {
    public static String[] addStore(String name, String[] stores){

     Integer arrayLenghth=stores.length;

     if (stores[arrayLenghth-1] != null) { stores=arrayResize(stores); arrayLenghth=stores.length; }

     for (int i=0; i<arrayLenghth;i++) {
         if (stores[i]!=null) { if (stores[i].equals(name)) {System.out.println("Store already exist"); return stores;}}
         if (stores[i]==null) {

             stores[i]=name;
             break;}
     }

     return stores;
    }

    public static String[]  deleteStore(String name, String[] stores){

        for (int i=0;i<stores.length;i++) {
            if (stores[i]==null) {System.out.println("Wrong name, can't delete"); return stores;}
            if (stores[i].equals(name)) { return arrayReshuffle(i,stores);}
        }

        System.out.println("Wrong name, can't delete");
        return stores;

    }

 //   public static String[]  viewStore(String name){

//        for (int i=0;i<stores.length;i++) {
//            if (stores[i] == null) {
//                System.out.println("Wrong name, can't view this store");
//                return stores;
//            }
//            if (stores[i].equals(name)) {
//
//                Console.productCommands();


//                String[] product = new String[2];
//
//                String action = Console.read();
//
//                while (!action.equals("4")) {
//
//                    if (action.equals("4")) break;
//                    switch (action) {
//
//                        // add store
//                        case "1":
//                            System.out.println("Enter store name");
//                            String name = Console.read();
//                            stores = Store.addStore(name, stores);
//                            Store.printStores(stores);
//                            break;
//// delete store
//                        case "2":
//                            if (stores[0] == null) {
//                                System.out.println("No stores to delete");
//                                break;
//                            }
//                            Store.printStores(stores);
//                            System.out.println("Enter store name from above you want to delete");
//                            String name2 = Console.read();
//                            stores = Store.deleteStore(name2, stores);
//                            Store.printStores(stores);
//                            break;
//
//                        //         view store
//                        case "3":
//
//                            if (stores[0] == null) {
//                                System.out.println("No stores to view");
//                                break;
//                            }
//                            Store.printStores(stores);
//                            System.out.println("Enter store name from above you want to view");
//                            String name3 = Console.read();
//
//
//                            Store.printStores(stores);
//                            break;
//
//                        case "4":
//                            Store.printStores(stores);
//                            break;
//
//
//                        default:
//                            Store.printStores(stores);
//                            System.out.println("Incorrect value");
//                            break;
//
//
//                        Product.addNewProduct(name);
//                    }
//                }
 //           }
   //     }

   // }

    public static String[] arrayResize(String[] stores){

        int arrLength=stores.length;
        String[] temp= new String[arrLength*2];

        for (int i=0;i<arrLength;i++){
            temp[i]=stores[i];
        }
        return temp;
    }

    public static String[] arrayReshuffle(int arrayIndex,String[] stores){

        for (int i=arrayIndex;i<stores.length-1;i++){
            stores[i]=stores[i+1];
        }

        stores[stores.length-1]=null;
        return stores;
    }

    public static void printStores(String[] stores){
        System.out.println("Stores array size "+ stores.length  );
        for (int i=0;i<stores.length;i++){
            if(stores[i]!=null) System.out.println("\t"+stores[i]);
            else {
                System.out.println("\t array current size " + i);
                break;
            }
        }
    }
}
