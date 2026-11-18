package week01_basic_syntax.day04;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //this is the structure to create a scanner

        System.out.println("Type your age:");
        int age = sc.nextInt();          //Gets the first int you type

        System.out.println("Type your height:");
        double height = sc.nextDouble(); //Gets the fisrt double you type

        System.out.println("Type your fisrt name:");
        String name = sc.next();         //Gets the first string
        sc.nextLine();

        System.out.println("Type your full name:");
        String fullName = sc.nextLine(); //Gets next line of terminal

        System.out.println(age);
        System.out.println(height);
        System.out.println(name);
        System.out.println(fullName);
        System.out.println();

        /* Some problems

        int interger = sc.nextInt(); When you press enter the line goes number + \n
        So you should add a sc.next() after it
        here goes an example:

         */

        System.out.println("Type a number");
        int integer = sc.nextInt();

        System.out.println("Type a word");
        String text = sc.nextLine(); //Is skips the scan cause it reads the \n from the buffer
        System.out.println();

        //To solver the problem you can add a sc.nextLine() after the nextInt();

        System.out.println("Type a number");
        integer = sc.nextInt();
        sc.nextLine();

        System.out.println("Type a word");
        text = sc.nextLine();

        System.out.println(integer);
        System.out.println(text);

        sc.close(); //Its a good habbit to clase the scan

    }
}
