package week01_basic_syntax.day04;

public class Printf {
    public static void main(String[] args){

        /*
            %d      integers (int, long, short, byte)      printf("%d", 20) → 20
            %.2f    decimals (double, float), 2 places     printf("%.2f", 3.14159) → 3,14
            %s      text (String) and any object           printf("%s", "java") → java
            %n      line break                             same as println
        */

        //How to format
        int age = 19;
        double height = 1.288;
        String name = "Luan";

        System.out.printf("Name: %s, Age: %d, Height: %.2f%n", name, age, height); //You should use "printf"

        // %n breakes the line

        System.out.printf("Hello");
        System.out.printf("World");   // HelloWorld

        System.out.printf("Hello%n");
        System.out.printf("World%n"); // Hello
                                      // World

        System.out.println();

        // %.2f rounds the number
        System.out.printf("%.1f%n", 2.26); //2.3



    }
}
