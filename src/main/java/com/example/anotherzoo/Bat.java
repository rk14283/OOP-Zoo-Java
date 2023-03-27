package com.example.anotherzoo;

import java.util.Date;

public class Bat extends Animal {
    public Bat(String name, int weight, Date dateOfBirth) {
        super(name, "big brown bat", weight, dateOfBirth);
    }

    public void useSonar() {
        System.out.println(this.name + " used Sonar to navigate the cave.");
    }
}