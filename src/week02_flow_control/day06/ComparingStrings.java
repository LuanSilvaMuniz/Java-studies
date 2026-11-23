package week02_flow_control.day06;
import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*
            == compares if it is the same object in memory
           .equals() compares the content

         */

        String a = new String("Content");
        String b = new String("Content");

        System.out.println(a == b); //false
        System.out.println(a.equals(b)); //true

        //sometimes == might works but it is not reliable

        String password = sc.nextLine(); //types "1234"

        if (password == "1234") { } //false
        if (password.equals("1234")) { } //true

        // useful variations

        String word = "YES";

        word.equals("yes"); //false
        word.equalsIgnoreCase("yes"); //true


        String input = null;

        input.equals("admin"); //NullPointerException
        "admin".equals(input); // false, no error
    }
}
