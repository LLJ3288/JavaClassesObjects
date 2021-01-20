package com.tts;

public class Pet {

    // instance variables
    // they are encapsulated, only accessible in this class

    private String name;
    private int age;
    private String location;
    private String type;

    // Pet constructor
    // a constructor automatically runs when the constructor is called
    // has the exact name as the class
    // has the actions that you want to take inside of the curly braces
    public Pet(String initName, int initAge, String initLocation, String initType) {
        name = initName;
        age = initAge;
        location = initLocation;
        type = initType;


    }

    public int getAge() {
        return age;


    }
    }

