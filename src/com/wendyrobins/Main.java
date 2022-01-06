package com.wendyrobins;

import javax.naming.Name;

public class Main {

    public static void main(String[] args) {
        String fName = "Mickey";
        String lName = "Mouse";
        String fullName = fName + " " + lName;
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(fullName);
        System.out.println(NameGenerator.generateFullName("John", "Doe"));

    }


}
