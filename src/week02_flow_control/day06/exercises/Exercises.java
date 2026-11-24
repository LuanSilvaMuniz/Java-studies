package week02_flow_control.day06.exercises;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
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

    static void ex1(Scanner sc) {

        //reads three numbers and print the higher using if else

        System.out.println("Exercise 1");

        System.out.println("Type three numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.printf("The biggest number is: %d", number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.printf("The biggest number is: %d", number2);
        } else if (number3 >= number2 && number3 >= number1) {
            System.out.printf("The biggest number is: %d", number3);
        }
    }

    static void ex2(Scanner sc) {

        //Classify the BMI (underweight, normal weight, overweight, obese).

        System.out.println("Exercise 2");

        System.out.println("What is your height? /cm");
        double height = sc.nextDouble();

        System.out.println("What is your weight?");
        double weight = sc.nextDouble();

        height = height / 100;

        double bmi = weight / Math.pow(height, 2);

        System.out.printf("Your BMI is %.1f kg/m²%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight!");
        } else if (bmi < 25) {
            System.out.println("You are within the average wheight range!");
        } else if (bmi < 30) {
            System.out.println("You are overweight!");
        } else {
            System.out.println("You are obese. Go ask for help.");
        }
    }

    static void ex3(Scanner sc) {

        // Reads three sides of a triangle and state whether it is valid and whether
        // it is equilateral, isosceles, or scalene.

        System.out.println("Exercise 3");

        System.out.println("Type three sides of a triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (!(a < b + c && b < a + c && c < a + b)) {
            System.out.println("Invalid triangle!");
        } else {

            if ((a == b && b != c) || (a == c && c != b) || (c == b && b != a)) {
                System.out.println("Your triangle is isosceles!");
            } else if (a == b && b == c) {
                System.out.println("You triangle is equilateral!");
            } else {
                System.out.println("Your triangle is scalene!");
            }
        }
    }

    static void ex4(Scanner sc) {

        //Asks for a password and comapres with a fixed password

        System.out.println("Exercise 4");

        String fixedPassword = new String("javastudies");

        System.out.println("Type the password:");
        sc.nextLine();
        String passwordTry = sc.nextLine();

        if (fixedPassword.equals(passwordTry)) {
            System.out.println("System released!");
        } else {
            System.out.println("Wrong password! Try again later.");
        }
    }

    static void ex5(Scanner sc) {

        //Check if a year is a leap year using the if statement.

        System.out.println("Exercise 5");

        System.out.println("How many days does the yeas have?");
        int days = sc.nextInt();

        if (days == 365 || days == 366){
            if (days == 366) {
                System.out.println("The year is leap year!");
            } else {
                System.out.println("The year is not leap year!");
                System.out.println("Invalid year! Try again later.");
            }
        } else {
                System.out.println("Invalid year! Try again later.");
        }
    }
}

