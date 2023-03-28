package com.example.anotherzoo;

import java.util.Date;

//public class Dragon extends Animal{
//    public Dragon(String name, int weight, Date dateOfBirth) {
//        //super is constructor of class you are inheriting things from
//        //we need to pass species in the constructor
//        super(name, "Dragon", weight, dateOfBirth);
//    }
//    public void breatheFire(){
//        System.out.println( "oh no!" + this.name + " is roasting a village of humans");
//    }
//}
public class Dragon implements Flyer {
    public String name;
        public Dragon (String name) {
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



