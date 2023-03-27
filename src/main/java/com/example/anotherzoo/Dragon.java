package com.example.anotherzoo;

import java.util.Date;

public class Dragon extends Animal{
    public Dragon(String name, int weight, Date dateOfBirth) {
        //super is constructor of class you are inheriting things from
        //we need to pass species in the constructor
        super(name, "Dragon", weight, dateOfBirth);
    }
    public void breatheFire(){
        System.out.println( "oh no!" + this.name + " is roasting a village of humans");
    }
}

