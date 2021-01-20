package com.tts;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //Phone n = new Phone();

        Phone phone1 = new Phone("Small: dimensions are 5.7 inches-Tall ", "Black", "AT&T and Sprint phones", "Android operating system");
        Refurbished refurbished = new Refurbished("Large, 6.7 inches, OLED-2778 x 1284", "Pearl white", "IPhone");

        System.out.println("Close out sale on selected phones, only a few left!!! ");
        System.out.println("Grab one today. Supplies are limited...");
        System.out.println("");
        System.out.println("***NEW Phones***");
        System.out.println("Only 10 in stock!!!!");
        System.out.println(phone1.getSize());
        System.out.println(phone1.getColor());
        System.out.println(phone1.getCarrier());
        System.out.println(phone1.getType());
        System.out.println("");
        System.out.println("All NEW phones are 10 percent off");
        int c = 500;
        double d = .10;
        System.out.println("So if the phone cost $500 then your discount is: ");
        System.out.println("$" + c * d);
        System.out.println("");
        System.out.println("___Refurbished Phones___");
        System.out.println("Only 6 in stock!!!!");
        System.out.println(refurbished.getSize());
        System.out.println(refurbished.getColor());
        System.out.println(refurbished.getType());
        System.out.println("");
        System.out.println("All Refurbished phones are 35 percent off ");
        int a = 350;
        double b = .30;
        System.out.println("");
        System.out.println("So if the phone cost $350 then your discount is: ");
        System.out.println("$" + a * b);
        System.out.println("");
        System.out.println("We do offer military discounts");
        System.out.println("So the same $500 dollar phone would get you a discount of:");
        int e = 500;
        double f = .17;
        System.out.println("$" + e * f);
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you please enter your age?");
        String age = scanner.next();
        System.out.printf("You are %s!\n", age);

        boolean age2 = true;
        age2 = !age2;
        System.out.println(age2);


                    //System.out.println("discount");
                    //System.out.println("no discount");
                }

        }


