package com.example.anotherzoo;

import java.util.Date;


//    public class Octopus extends Animal {
//
//        public Octopus(String name, int weight, Date dateOfBirth) {
//            super(name, "Octopus", weight, dateOfBirth);
//        }
//        public void swim(){
//            System.out.println( this.name + " is swimming in the aquarium");
//        }
//    }


public class Octopus implements constrictor {
    public String name;
    public Octopus (String name) {
        this.name= name;
        //System.out.println(name);

    }
    public void constrict () {
        System.out.println(name+" constricted a fish.");
        //this.dragonState = "flying";
        // return "flying";

    }
}