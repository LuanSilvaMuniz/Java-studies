package week01_basic_syntax.day04.Exercises;
import java.util.Scanner;
import java.time.Year;

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

        sc.close();
    }

    static void ex1(Scanner sc){

        //Ask name and year of birth and print a greeting with the approximate age

        System.out.println("Exercise 1");

        System.out.println("What is your name?:");
        String name = sc.nextLine();

        System.out.println("Which year were you born?:");
        int year = sc.nextInt();

        int age = Year.now().getValue() - year; //used java.time.Year

        System.out.printf("Hello %s! You are about %d years old.%n", name, age);

    }

    static void ex2(Scanner sc){

        /*
            Read two numbers and print their sum, subtraction,
            multiplication, and division with 2 decimal places using printf.
         */

        System.out.println("Exercise 2");

        System.out.println("Type first number:");
        double numberA = sc.nextDouble();

        System.out.println("Type second number:");
        double numberB = sc.nextDouble();

        System.out.printf("Sum: %.2f%n", numberA + numberB);
        System.out.printf("Subtraction: %.2f%n", numberA - numberB);
        System.out.printf("Multiplication: %.2f%n", numberA * numberB);
        System.out.printf("Division: %.2f%n", numberA / numberB);

    }

    static void ex3(Scanner sc){

        //Create a Celsius to Fahrenheit converter;

        System.out.println("Exercise 3");

        System.out.println("Type the temperature in Celsius:");
        double celsius = sc.nextDouble();

        double fahreinheit = celsius * 9 / 5 + 32;

        System.out.printf("Fahrenheit: %.2f%n", fahreinheit);

    }

    static void ex4(Scanner sc){

        //Create an BMI calculator who reads weight and height and prints the formatted value

        System.out.println("Exercise 4");

        System.out.println("What is your height?");
        double height = sc.nextDouble();

        System.out.println("What is your weight?");
        double weight = sc.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        System.out.printf("Your BMI is %.2f kg/m²%n", bmi);

    }
}
