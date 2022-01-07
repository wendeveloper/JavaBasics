/*
Java Basics Challenge (3/3)
In your JavaBasics Project complete the following:
Create a new class called NameGenerator
Within this class create a generateFullName method that takes in a first and last name, then returns a full name.
This method should be declared "static"
Once your method has been completed, call the generateFullName method from the Main class' main method.
This will be similar to the test done in (2/3) but now you are calling a method outside of the Main class.
BONUS: removed "static" from generateFullName, refactor your code so you can call the method within the Main class.
 */
package com.wendyrobins;

public class NameGenerator {

    private String fName;
    private String lName;

    // constructor blueprint
    public NameGenerator(String fName, String lName){
        this.fName = fName;
        this.lName = lName;

    }


    // method
//    public static String generateFullName(String fName, String lName){
    public String generateFullName(String fName, String lName){
        return fName + " " + lName;
    }

}
