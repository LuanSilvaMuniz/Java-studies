package week02_flow_control.day07.exercises;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ex1(sc);
        System.out.println();

        ex2(sc);
        System.out.println();

        ex3(sc);
        System.out.println();

        ex4(sc);
        System.out.println();

        ex5(sc);
        System.out.println();

        sc.close();
    }

    static void ex1 (Scanner sc) {

        System.out.println("Exercise 1");

        //Gets one number from 1 to 7 and print the day of the week

        System.out.println("Type a number: 1 - 7");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Its Sunday");
                break;
            case 2:
                System.out.println("Its Monday");
                break;
            case 3:
                System.out.println("Its Tuesday");
                break;
            case 4:
                System.out.println("Its Wednesday");
                break;
            case 5:
                System.out.println("Its Thursday");
                break;
            case 6:
                System.out.println("Its Friday");
                break;
            case 7:
                System.out.println("Its Saturday");
                break;
            default:
                System.out.println(number + " Is not a weekday!");
                break;
        }
    }

    static void ex2 (Scanner sc) {

        System.out.println("Exercise 2");

        //Create a calculator which gets two numbers and a operator + - / *

        System.out.println("==== CALCULATOR ====");
        System.out.println("Type the first number:");
        int number1 = sc.nextInt();

        System.out.println("Type the operator: (+, -, /, *)");
        char operator = sc.next().charAt(0);

        System.out.println("Type de second number:");
        int number2 = sc.nextInt();

        switch (operator) {
            case '+' -> System.out.printf("Addition: %d", number1 + number2);
            case '-' -> System.out.printf("Subtraction: %d", number1 - number2);
            case '*' -> System.out.printf("Multiplication: %d", number1 * number2);
            case '/' -> System.out.printf("Division: %d", number1 / number2);
            default -> System.out.printf("Unknown operator....");
        }
    }

    static void ex3 (Scanner sc) {

        //Convert a numerical grade into a grade (A to F) using a switch expression.

        System.out.println("What is the grade? 0 - 100");
        int number = sc.nextInt();

        String grade = switch (number / 10) {
            case 10, 9 -> "A";
            case 8  -> "B";
            case 6, 7 -> "C";
            case 4, 5 -> "D";
            default -> "F";
        };

        System.out.println("Grade: " + grade);
    }

    static void ex4 (Scanner sc) {

        System.out.println("Exercise 4");

        //Given the month number, return how many days it has.

        boolean leapYear = false;

        System.out.println("Type the month number:");
        int monthNumber = sc.nextInt();

        if (monthNumber == 2) {

            System.out.println("Is it a leap year? (y/n)");
            String op = sc.next();

            leapYear = switch (op.toLowerCase()) {
                case "y" -> true;
                case "n" -> false;
                default -> throw new IllegalArgumentException("Invalid option: " + op);
            };
        }

        int days = switch(monthNumber){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                yield leapYear ? 29 : 28;
            }
            default -> throw new IllegalArgumentException("Invalid month: " + monthNumber);
        };

        System.out.printf("The month has %d days! %n", days);
    }

    static void ex5 (Scanner sc) {

        System.out.println("Exercise 5");

        //Create a menu with 4 option and treat the invalid option with default

        System.out.println("===== MENU =====");
        System.out.println("1 - Open files");
        System.out.println("2 - Remove files");
        System.out.println("3 - Create file");
        System.out.println("4 - Edit files");
        System.out.println("Type an option:");

        int option = sc.nextInt();

        switch (option) {
            case 1 -> System.out.println("Opening files.....");
            case 2 -> System.out.println("Removing files.....");
            case 3 -> System.out.println("Creating file.....");
            case 4 -> System.out.println("Editing files.....");
            default -> System.out.println("Invalid option!");
        }
    }
}

