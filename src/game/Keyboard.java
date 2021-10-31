package game;

import java.util.Scanner;

class Keyboard {
    private Scanner in;

    Keyboard() {
        in = new Scanner(System.in);

    }

    public int readInteger(String askUserMsg, String errorMsg) {
        int num = 0;
        String strInput;
        boolean valid = false;

        // Loop until correct input
        while (valid == false) {
            // Ask user
            System.out.print("askUserMsg");
            // Get input from keyboard
            strInput = in.nextLine();
            try {
                num = Integer.parseInt(strInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("errorMsg");
            }
        }
        return num;

    }
    public int readInteger(String askUserMsg, String errorMsg, int low, int high){
        int num = 0;
        String strInput;
        boolean valid = false;

        // Loop until correct input
        while (valid == false) {
            // Ask user
            System.out.print("Enter choice:");
            // Get input from keyboard
            strInput = in.nextLine();
            try {
                num = Integer.parseInt(strInput);
                if (num >=low && num<= high)
                    valid = true;
                else
                    System.out.println("Error: invalid input");

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input");
            }
        }
        return num;

    }


    public double readDouble(String askUserMsg, String errorMsg) {
        double num = 0;
        String strInput;
        boolean valid = false;

        // Loop until correct input
        while (valid == false) {
            // Ask user
            System.out.print("askUserMsg");
            // Get input from keyboard
            strInput = in.nextLine();
            try {
                num = Double.parseDouble(strInput);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("errorMsg");
            }
        }
        return num;

    }
}