package com.example.anotherzoo;

import java.util.Date;

//public class Bat extends Animal {
//    public Bat(String name, int weight, Date dateOfBirth) {
//        super(name, "big brown bat", weight, dateOfBirth);
//    }
//
//    public void useSonar() {
//        System.out.println(this.name + " used Sonar to navigate the cave.");
//    }
//}

public class Bat implements Flyer {
    public String name;
    public Bat (String name) {
        this.name= name;
        //System.out.println(name);

    }

    public void fly () {
        System.out.println(name+" is flying.");
        //this.dragonState = "flying";
        // return "flying";

    }
    public void roost () {
        System.out.println(name+" landed, and is resting.");
    }


}