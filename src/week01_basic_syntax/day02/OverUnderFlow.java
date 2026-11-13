package week01_basic_syntax.day02;

public class OverUnderFlow {
    public static void main(String[] args){

        /*
         * PRIMITIVE TYPES
         *
         * byte    -> 8 bits  or 1 byte  | from -128 to 127
         * short   -> 16 bits or 2 bytes | from -32,768 to 32,767
         * int     -> 32 bits or 4 bytes | from -2,147,483,648 to 2,147,483,647
         * long    -> 64 bits or 8 bytes | from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         * float   -> 32 bits or 4 bytes | max. 3.4028235E38 (Float.MAX_VALUE), smallest positive 1.4E-45 (Float.MIN_VALUE)
         * double  -> 64 bits or 8 bytes | max. 1.7976931348623157E308 (Double.MAX_VALUE), smallest positive 4.9E-324 (Double.MIN_VALUE)
         * boolean -> 1 bit   or 1 byte  | true or false
         * char    -> 16 bits or 2 bytes | from '\u0000' (0) to '\uffff' (65,535)
         */

        byte x = 127;           //The system is gonna print the value -128, because a byte MAX_VALUE is 127.
        x++;                    //A buffer overflow occurred here.
        System.out.println(x);
        System.out.println();

        int max = Integer.MAX_VALUE;
        System.out.println(max);

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        System.out.println();
        System.out.println(max + 1); //Overflow
        System.out.println(min - 1); //Underflow


        //Double and float

        double maxDouble = Double.MAX_VALUE;
        System.out.println();
        System.out.println(maxDouble * 2); //Infinity

        double minDouble = Double.MIN_VALUE;
        System.out.println(minDouble / 2); //0.0


        //How to avoid overflow problem

        int result = Math.addExact(Integer.MAX_VALUE, 1);
        System.out.println(result);
    }
}
