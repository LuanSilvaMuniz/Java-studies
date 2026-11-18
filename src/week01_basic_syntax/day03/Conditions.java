package week01_basic_syntax.day03;

public class Conditions {
    public static void main(String[] args){

        /*
                    relational and logical operators

            ==       equal to              5 == 5  = true
            !=       not equal to          5 != 3  = true
            <        less than             3 < 5   = true
            >        greater than          7 > 4   = true

            &&       logical AND           true && true  = true
            ||       logical OR            true || false = true
            !        logical NOT           !true         = false

        */

        int age = 20;

        System.out.println(age > 18);  // true
        System.out.println(age < 18);  // false
        System.out.println(age == 20); //true
        System.out.println(age <= 20); //true
        System.out.println(age != 20); //false
        System.out.println();

        boolean over18 = age >= 18;
        System.out.println(over18);    //true
        System.out.println();

        // == comparison

        System.out.println(5 == 5.0);  //true
        System.out.println('a' == 97); //true
        System.out.println();

        System.out.println(0.1 + 0.2 == 0.3); //false 0.1 + 0.2 = 0.30000000000000004
        System.out.println();

        //comparison strings

        String a = new String("java");
        String b = new String("java");

        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true, always use .equals()
        System.out.println();

        //Logical OR, AND, NOT

        boolean istrue = true;
        int number = 10;

        System.out.println(number > 5 && istrue);  //true (both are true)
        System.out.println(number > 11 || istrue); //true (only one needs to be true)
        System.out.println(!istrue);               //false (! inverts the value)
        System.out.println();

    }
}
