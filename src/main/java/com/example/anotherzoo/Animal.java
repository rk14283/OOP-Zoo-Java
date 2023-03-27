package com.example.anotherzoo;
import java.util.Date;
public class Animal {
    String name;
    String species;
    int weight;
    Date dateOfBirth;

    public Animal(String name, String species, int weight, Date dateOfBirth) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }
    public void eat(){
        System.out.println(this.name+ " is eating");
        this.weight = this.weight + 2;
        System.out.println(this.name + " is now "+ this.weight + " kg");

    }
}
