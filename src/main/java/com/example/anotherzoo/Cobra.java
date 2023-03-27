package com.example.anotherzoo;

import java.util.Date;

public class Cobra extends Animal {
    public Cobra(String name, int weight, Date dateOfBirth) {
        super(name, "king cobra", weight, dateOfBirth);
    }

    public void bite() {
        System.out.println(this.name + " just bit a mouse and injected it with poison.");
    }
}