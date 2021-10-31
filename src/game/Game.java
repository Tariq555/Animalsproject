package game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        System.out.println("Welcome to the game");
        System.out.println("_________________");

            Scanner startGame = new Scanner(System.in);
            System.out.println("input your  number choice");
            System.out.println("press 1 to New Game");


            int choice = startGame.nextInt();

            switch (choice) {
                case 1: // NY MATCH
                    System.out.println("Welcome to our store");
                    System.out.println("Please select which animal you will buy\n");
                    Store animal = new Store();
                    System.out.println(animal);
                    System.out.println("write your choese:");
                    String animalChoice = startGame.next();

                    // Then we have to build if & if else when we chose what's happing and like this

                    break;

                case 2: // HISTORIK


                    break;
                case 3: // AVSLUTA SPELET
                    System.out.println("Sorry to see you go " );

                    break;


            }
        }
    }

