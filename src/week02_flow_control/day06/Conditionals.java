package week02_flow_control.day06;

public class Conditionals {
    public static void main(String[] args) {

        //if else syntax

        int age = 20;

        //the condition needs to be a boolean

        if (age >= 18) { //if only execute the action if the condition is true
            System.out.println("Adult");
        }

        //with else you define what happens when the condition is false

        age = 15;

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        } //Minor

        //With else if you chain multiple conditions

        int score = 20;

        if (score == 90) {
            System.out.println("A+");
        } else if (score >= 70) {
            System.out.println("B+");
        } else if (score >= 50) {
            System.out.println("C+");
        } else {
            System.out.println("F-");
        } //F-

        //the order matters

        int randomNumber = 90;

        if (randomNumber > 40) {
            System.out.println("More than 40"); //stops here
        } else if (randomNumber > 80) {
            System.out.println("More than 80");
        }
    }
}
