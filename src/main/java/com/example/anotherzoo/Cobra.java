package com.example.anotherzoo;

import java.util.Date;

//public class Cobra extends Animal {
//    public Cobra(String name, int weight, Date dateOfBirth) {
//        super(name, "king cobra", weight, dateOfBirth);
//    }
//
//    public void bite() {
//        System.out.println(this.name + " just bit a mouse and injected it with poison.");
//    }
//}

public class Cobra implements constrictor {
    public String name;
    public Cobra (String name) {
        this.name= name;
        //System.out.println(name);

    }
    public void constrict () {
        System.out.println(name+" constricted a mouse.");
        //this.dragonState = "flying";
        // return "flying";

    }
}