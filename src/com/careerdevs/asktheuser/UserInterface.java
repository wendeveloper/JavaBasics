package com.careerdevs.asktheuser;

/*
NUMBER TYPES:
byte --> scanner.nextByte();
short --> scanner.nextShort();
int --> scanner.nextInt();
float --> scanner.nextFloat();
long --> scanner.nextLong();
double --> scanner.nextDouble();

BOOLEAN:
boolean --> scanner.nextBoolean();

STRING:
String --> scanner.nextLine();

 */

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMBER TYPES: ");

        System.out.println("Enter a BYTE: ");   //byte example: 100
        byte inputByte = scanner.nextByte();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter a SHORT: ");  //short example: 123
        short inputShort = scanner.nextShort();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter an INTEGER: ");  //integer example: 12345
        int inputInt = scanner.nextInt();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter a FLOAT: ");      //float example: 10.50
        float inputFloat = scanner.nextFloat();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter a LONG: ");       //long example: 10045345435
        long inputLong = scanner.nextLong();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("Enter a DOUBLE: ");     //double example: 1234.89
        double inputDouble = scanner.nextDouble();

        System.out.println();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("BOOLEAN: ");

        System.out.println("Enter a BOOLEAN: ");        //boolean example: true
        Boolean inputBoolean = scanner.nextBoolean();

        scanner.nextLine(); // Consume newline left-over

        System.out.println("STRING: ");

        System.out.println("Enter a STRING: ");     //string example: "Hello world"
        String inputString = scanner.nextLine();

//                inputByte + " " +
//                inputShort + " " +
//                inputInt + " " +
//                inputFloat + " " +
//                inputLong + " " +
//                inputDouble + " " +
//                inputBoolean + " " +
//                inputString;


    }
}
