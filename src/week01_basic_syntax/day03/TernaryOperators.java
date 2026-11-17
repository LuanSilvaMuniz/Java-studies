package week01_basic_syntax.day03;

public class TernaryOperators {
    public static void main(String[] args){

        /*
           Its has a simple structure:

           condition ? valueIfTrue : valueIfFalse
         */

        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status); // Adult

        // We can nest it
        int grade = 3;
        String status2 = (grade >= 7) ? "Aproved" : (grade >= 5) ? "recovery" : "reproved";
        System.out.println(status2);

        //Directly on print
        int number = 15;
        System.out.println((number > 20) ? "More than 20" : "Less than 20");
    }
}
