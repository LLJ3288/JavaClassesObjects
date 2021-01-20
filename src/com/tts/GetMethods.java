package com.tts;

public class GetMethods {

    private String name;
    private int age;
    private String type;


    public GetMethods(String initName, int initAge, String initType) {
        name = initName;
        age = initAge;
        type = initType;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }
}

