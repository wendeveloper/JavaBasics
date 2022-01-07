package com.wendyrobins;

import javax.naming.Name;

public class Main {

    public static void main(String[] args) {
//        String fName = "Mickey";
//        String lName = "Mouse";
//        String fullName = fName + " " + lName;

//        System.out.println(fName);
//        System.out.println(lName);
//        System.out.println(fullName);
//
//        System.out.println(NameGenerator.generateFullName("John", "Doe"));

        //instance of NameGenerator class
        NameGenerator nameGenerator1 = new NameGenerator("John", "Doe");

        System.out.println(nameGenerator1.generateFullName("Bugs", "Bunny"));



        //System.out.println(NameGenerator.generateFullName("John", "Doe"));


//        System.out.println(createFullName("Peter", "Pan"));
    }

    public static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }


}
