package week01_basic_syntax.day03.exercises;

public class Exercise {
    public static void main(String[] args){

        ex1();
        System.out.println();

        ex2();
        System.out.println();

        ex3();
        System.out.println();

        ex4();
        System.out.println();

        ex5();
        System.out.println();

    }

    static void ex1() {

        //Converts one number to hours, minutes, and seconds using / and %

        System.out.println("Exercise 1");

        int number = 51234;

        int hours = (number - number % 3600) / 3600;
        int minutes = (number - hours * 3600) / 60;
        int seconds = (number - hours * 3600 - minutes * 60);


        System.out.println(hours + "h " + minutes + "min " + seconds + "sec");

    }


    static void ex2(){

        //Testing the difference between i++ and ++i

        System.out.println("Exercise 2");

        int i = 10;

        int a = i++;
        System.out.println(a); // 10 (adds after the inicialization)

        i = 10;

        int b = ++i;
        System.out.println(b); // 11 (adds before the inicialization)
    }


    static void ex3(){

        //Verify if a number is odd or even

        System.out.println("Exercise 3");

        int number = 124;

        String status = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(status);

    }

    static void ex4(){

        //Calculate 3 grades and print if the student is aproved or reproved

        System.out.println("Exercise 4");

        int grade1 = 10;
        int grade2 = 5;
        int grade3 = 4;

        int mean = (grade1 + grade2 + grade3) / 3;
        String status = (mean >= 7) ? "Aproved" : "Reproved";
        System.out.println("The student is: " + status);

    }

    static void ex5(){

        int days = 365;
        boolean bool = days % 365 == 0;
        String status = (bool) ? "Não é bisexto" : "Bisexto";

        System.out.println(status);


    }

}
