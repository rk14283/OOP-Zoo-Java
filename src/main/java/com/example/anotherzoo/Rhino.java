package com.example.anotherzoo;

import java.util.Date;

public class Rhino extends Animal {

    public Rhino(String name, int weight, Date dateOfBirth) {
        super(name, "white Rhino", weight, dateOfBirth);
    }
    public void charge(){
        System.out.println( this.name + " rammed through the wall");
    }
}
