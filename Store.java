import java.util.Scanner;

public class Store {

    public static void displayMenu(int options[], String menuItems[], double price[]){
        // Display menu

        System.out.println("M e n u");
        System.out.println(" ==========================");
        // Menu and options loop
        for(int i = 0; i < options.length-1; i++){
            System.out.printf("%d. %s \t %.2f\n", options[i], menuItems[i], price[i]);
        }
        // Print EXIT option
        System.out.printf("%d. %s\n", options[options.length-1], menuItems[menuItems.length-1]);
        System.out.println(" ==========================");
    }
    public static void main(String[] args) {
        // Player choice
        int choice;

        // menuarray
        int options[] = {1,2,3,4};
        String menuItems [] = {"Dryfood","Meat","Fruit","Exit"};
        double prices [] = {20, 25, 10};
        // Exit option
        int EXIT = options[options.length-1];
        // Keyboard object for input
        Keyboard key = new Keyboard();

        // Display menu
        displayMenu(options, menuItems, prices);

        // Scanner setup
        Scanner in = new Scanner(System.in);

        // Getting choice from player
        choice = key.readInteger("Enter choice: ", "Error invalid input.", 1, EXIT);

        // Menu loop
        while(choice != EXIT) {

            if (choice == options[0]) {
                System.out.println(" Dry food " + prices[0]);
            }
            else if (choice == options[1]) {
                System.out.println( "Meat " + prices[1]);
            }
            else if (choice == options[2]) {
                System.out.println(" Fruit " + prices[2]);

            }

            // Display menu
            displayMenu(options,menuItems, prices);

            // Getting choice from payer
            choice = key.readInteger("Enter choice: ", "Error: invalid input" , 1, EXIT);

        }

        // Checking choice
        if (choice == 1) {
            System.out.println("Dry food");

        }
        else if (choice == 2) {
            System.out.println("Meat");

        }
        else if (choice == 3) {
            System.out.println("Fruit");

        }
        else if (choice == 4) {
            System.out.println("Goodbye, have a nice day!");

        }






    }



}


