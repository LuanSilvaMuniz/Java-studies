package week02_flow_control.day07;

import java.util.Locale;

public class Switches {
    public static void main(String[] args){

        /*
        accepts: byte, short, int, char
        Byte, Short, character, Integer (wrappers)
        String
        enum
        */

        int condition = 1;
        switch(condition){
            case 1: //run
                //code
                break;
            case 2: //do not run
                //code
                break;
            default: //do not run
                //code
        }

        /* Rules
           The value has to be constant on compilation time
           There cannot be two case with the same value
           The case type has to be compatible with the one from the expression
         */

        final int ADMIM = 1;
        int profile = 1;

        switch (profile) {
            case ADMIM:
                System.out.println("Administrator");
                break;
            case 2:
                System.out.println("User");
                break;
        } //administrator

        System.out.println();

        //default runs when any case hits. It is optional
        //It can be in any position but if at the start it runs and go to the next case

        int n = 5;
        switch (n) {
            default:
                System.out.print("C");
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("B");
                break;
        } //Result: CA

        System.out.println();

        //Fall through
        //Is when the execution "falls" to the next case due to lack of break;
        //Intetional use:

        char letter = 'a';
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonant");
                break;
        } //Vocal

        System.out.println();

        //Intenional use with accumulation

        System.out.print("The user has access to");
        int level = 2;
        switch (level) {
            case 3:
                System.out.print(" Reports");
            case 2:
                System.out.print(" Edition");
            case 1:
                System.out.print(" Reading");
        } //The user has access to Edition Reading

        //if you forget the break; it will run all cases after the one in case

        System.out.println();

        //String comparasion

        String command = "Exit";
        switch (command.toLowerCase()) { //without the toLowerCase() it would run the default case
            case "exit":
                System.out.println("Finishing.....");
                break;
            default:
                System.out.println("Unknown command.");
                break;
        } //Finishing

        System.out.println();

        //null
        String s = "null"; // <- imagine this is null
        switch (s) {
            default: //NullPointerException if null
                System.out.println("Nothing");
        }

        System.out.println();

        //Enum

        enum Day {THURSDAY, FRIDAY, SATURDAY};

        Day a = Day.SATURDAY;
        switch (a) {
            case THURSDAY:
            case FRIDAY:
                System.out.println("Business day");
                break;
            case SATURDAY:
                System.out.println("Weekend");
                break;
        }
    }
}
