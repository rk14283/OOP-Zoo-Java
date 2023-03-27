package com.example.anotherzoo;

import java.util.Date;


    public class Octopus extends Animal {

        public Octopus(String name, int weight, Date dateOfBirth) {
            super(name, "Octopus", weight, dateOfBirth);
        }
        public void swim(){
            System.out.println( this.name + " is swimming in the aquarium");
        }
    }

