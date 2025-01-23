//Boo!!

import java.util.Scanner;

public class Main {
    //Global objects:
    static Scanner scanner = new Scanner(System.in);

    //Global variables:
    static final String LASTUPDATE = "23.01.25";
    static final String BUILD = "0001";
    static final String DIVIDER = "\n--------------------------------------------\n";

    public static void main(String[] args){
        System.out.println("++++ NoHardFeelings ++++");
        System.out.println("Build: " + BUILD + " / Last Updated: " + LASTUPDATE);
        System.out.println(DIVIDER);

        Field.print();
        start();
    }

    public static void start(){
        System.out.print("Open settings panel? [1/0]: ");
        switch (scanner.nextInt()){
            case 1 -> config();
            case 0 -> {}
            default -> exit(true, 1);
        }
    }

    public static void config(){
        //Change global settings stored in Settings.java
    }

    public static void exit(boolean isError, int errorCode){
        if(isError){
            String error = "\nError: ";
            switch (errorCode){
                case 1 -> error += "Invalid selection.";
                default -> error += "Internal system conflict";
            }
            System.out.print(error);
        } else {
            System.out.println("\nSession terminated.");
        }
        System.exit(0);
    }
}