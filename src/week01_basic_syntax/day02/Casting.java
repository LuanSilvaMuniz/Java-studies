package week01_basic_syntax.day02;

public class Casting {
    public static void main(String[] args){

        //Casting is transforming one data type into another

        byte x = 127;
        int y = x;    //byte x became int y

        System.out.println(y); //127
        System.out.println();


        //implicit casting occurs when java converts automatically

        int j = 10;
        long k = j;   //int -> long, automatically
        double l = k; //long -> double, automatically

        System.out.println(l); //10.0
        System.out.println();

        //Explicit casting is done manually

        double pi = 3.14;
        int integer = (int) pi;  //manually

        System.out.println(integer); //3

        //Overflow can also happen with explicit casting

        int value = 300;
        byte z = (byte) value;

        System.out.println(z); //44

    }
}
