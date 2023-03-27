package com.example.anotherzoo;
import java.util.Scanner;
import java.util.Date;
//this function only works inside com.example.anotherZoo
public class hello {
    public static void main(String[] args){

        Scanner ReadLineDragon = new Scanner(System.in);
        System.out.println("Enter name of the dragon");

        String dragonName = ReadLineDragon.nextLine();

        //create animal class that inherits traits of animal
         Dragon dragon = new Dragon(dragonName,200,new Date());
        System.out.println(dragon);
        dragon.breatheFire();
        dragon.eat();


        Scanner ReadLineOctopus = new Scanner(System.in);
        System.out.println("Enter name of the octopus");

        String octopusName =ReadLineOctopus.nextLine();
        Octopus octopus = new Octopus(octopusName, 50, new Date());
        System.out.println(octopus);
        octopus.swim();
        octopus.eat();

        Scanner ReadLineCobra = new Scanner(System.in);
        System.out.println("Enter name of the cobra");

        String cobraName =ReadLineCobra.nextLine();
        Cobra cobra = new Cobra(cobraName, 10, new Date());
        System.out.println(cobra);
        cobra.bite();
        cobra.eat();

        Scanner ReadLineBat = new Scanner(System.in);
        System.out.println("Enter name of the bat");

        String batName =ReadLineBat.nextLine();
        Bat bat = new Bat(batName, 5, new Date());
        System.out.println(bat);
        bat.useSonar();
        bat.eat();

        Scanner ReadLineRhino = new Scanner(System.in);
        System.out.println("Enter name of the rhino");

        String rhinoName =ReadLineRhino.nextLine();
        Rhino rhino = new Rhino(rhinoName, 500, new Date());
        System.out.println(rhino);
        rhino.charge();
        rhino.eat();


    }
    }


