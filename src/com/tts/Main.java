package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // instantiate objects
        Pet pet1 = new Pet("Butkis", 7, "Yorkstown", "British bulldog");
        GetMethods  getMethods = new GetMethods("Name: Butkis",  7, "Type: British bulldog");


        //System.out.println(pet1.getAge());
        System.out.println(getMethods.getName());
        System.out.println(getMethods.getAge());
        System.out.println(getMethods.getType());
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter your pet's name?");
        String someString = scanner.next();
        System.out.println("Enter your pet's age?");
        String someString3  = scanner.next();
        System.out.println("Enter your location?");
        String someString1 = scanner.next();
        System.out.printf("Oh okay, yours pet's name is %s!\n", someString);
        System.out.printf("You have indicated that their age is %s!\n", someString3);
        System.out.printf("I hope the weather is good in %s!\n", someString1);
    }
}
