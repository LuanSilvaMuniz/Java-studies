package week01_basic_syntax.day03;

public class Operators {
    public static void main(String[] args) {

        /*
                     operators
            +        adition          3 + 5 = 8
            -        subtraction      7 - 3 = 4
            *        multiplication   2 * 9 = 18
            /        division         20 / 2 = 10
            %        modulo           7 % 2 = 1

         */

        System.out.println(13 / 3);   //int / int = int
        System.out.println(13.0 / 2); // double / int = double
        System.out.println(13 / 2.0);
        System.out.println(-13 / 3);  // int / int = int
        System.out.println();

        double wrong = (double) (7 / 2); // 3 (int / int = int)
        double correct = (double) 7 / 2; // 3.5

        //Division by zero
        //* System.out.println(5 / 0);    ArithmeticException: / by zero
        System.out.println(5.0 / 0);   // Infinity
        System.out.println(-5.0 / 0);  // -Infinity
        System.out.println(0.0 / 0);   // NaN (Not a Number)
        System.out.println();

        //Modulo
        System.out.println(10 % 3); // 1 (10 = 3 * 3 + 1)
        System.out.println(10 % 2); // 0 (exact division)
        System.out.println(2 % 5);  // 2 (the result is the number itself)
        System.out.println();

        //The sign follows the first number
        System.out.println(7 % 3);    // 1
        System.out.println(-7 % 3);   // -1
        System.out.println(7 % -3);   // 1
        System.out.println(-7 % -3);  // -1
        System.out.println();

        //Overflow
        int a = 2000000000;
        long b = a * 2; //Wrong, an overflow will occur
        long c = a * 2L; //Correct

        //Operations with string
        System.out.println(1 + 2 + "a");   //3a Adds first from left to right
        System.out.println("a" + 1 + 2);   //a12 Once a String is encountered, subsequent operations combine values as String
        System.out.println("a" + (1 + 2)); //a3
        System.out.println();

        //Compound Assignment Operators
        int x = 10;
        x += 5;  //x = x + 5  ->  15
        x -= 5;  //x = x - 5  ->  5
        x *= 2;  //x = x * 2  ->  20
        x /= 2;  //x = x / 2  ->  5
        x %= 3;  //x = x % 3  ->  1

        int y = 2;
        y--; //y = 1
        y++; //y = 3

        //Math methods
        Math.pow(2, 3);       // 8.0 (power, always returns a double)
        Math.sqrt(16);        // 4.0 (square root)
        Math.abs(-5);         // 5 (absolute value)
        Math.round(3.5);      // 4 (rounds to the nearest integer)
        Math.floor(3.9);      // 3.0 (rounds down)
        Math.ceil(3.1);       // 4.0 (rounds up)
        Math.max(3, 7);       // 7 (larger of the two values)
        Math.min(3, 7);       // 3 (smaller of the two values)
        Math.floorMod(-7, 3); // 2 (remainder that always takes the sign of the divisor, so it is positive here)
    }
}