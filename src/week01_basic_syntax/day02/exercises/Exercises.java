package week01_basic_syntax.day02.exercises;

public class Exercises {
    public static void main(String[] args){

        //variables
        byte byte1 = 100;
        short short1 = 30040;
        int integer1 = 1542990;
        long long1 = 9993213999943423L;
        float float1 = 2.2f;
        double double1 = 10.3213232312d;
        char char1 = '\u0041';

        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(integer1);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(double1);
        System.out.println(char1);
        System.out.println();


        //Overflow
        int integer2 = Integer.MAX_VALUE;
        System.out.println(integer2 + 1); //-2147483648 became the MIN_VALUE (overflow)
        System.out.println();


        // Integer division vs. decimal division
        int a = 7;
        double b = 7;

        System.out.println(a / 2);
        System.out.println(b / 2);
        System.out.println();


        //Explicit casting
        double c = 9.99;
        int d = (int) c;
        System.out.println(d); //9
        System.out.println();

        //Caculating a circle
        circle();
    }

    static void circle(){

        final float pi = 3.14f;
        int radius = 5;

        float area = pi * radius * radius;
        float perimeter = 2 * pi * radius;

        System.out.println("Radius = 5, pi = 3.14");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
