package com.company;

public class Product {



    public static String[] addNewProduct(String name, String[] products){

        Integer arrayLenghth=products.length;

        if (products[arrayLenghth-1] != null) { products=arrayResize(products); arrayLenghth=products.length; }

        for (int i=0; i<arrayLenghth;i++) {
            if (products[i]==null) {

                products[i]=name;
                break;}
        }

        return products;
    }

    public static String[]  deleteProduct(String name, String[] products){

        for (int i=0;i<products.length;i++) {
            if (products[i]==null) {System.out.println("Wrong name, can't delete"); return products;}
            if (products[i].equals(name)) { return arrayReshuffle(i,products);}
        }

        System.out.println("Wrong name, can't delete");
        return products;

    }

    public static String[] arrayResize(String[] products){

        int arrLength=products.length;
        String[] temp= new String[arrLength*2];

        for (int i=0;i<arrLength;i++){
            temp[i]=products[i];
        }
        return temp;
    }

    public static String[] arrayReshuffle(int arrayIndex,String[] products){

        for (int i=arrayIndex;i<products.length-1;i++){
            products[i]=products[i+1];
        }

        products[products.length-1]=null;
        return products;
    }

}
