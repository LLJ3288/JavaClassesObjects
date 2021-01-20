package com.tts;

//public Phone ();

//        }

public class Phone {


    private String size;
    private String color;
    private String carrier;
    private String type;


    public Phone(String initSize, String initColor, String initCarrier, String initType) {
        size = initSize;
        color = initColor;
        carrier = initCarrier;
        type = initType;
    }

    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public String getCarrier() {
        return carrier;
    }
    }

