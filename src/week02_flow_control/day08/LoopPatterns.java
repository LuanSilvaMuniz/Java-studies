package week02_flow_control.day08;
import java.util.Scanner;

public class LoopPatterns {
    public static void main(String[] args){

        //Counters: A variable wich counts how many times the something happens

        int counter = 0;
        while (counter <= 5) {
            System.out.println("Lap " + counter);
            counter++;
        } //The final value of the variable counter is the number of times the while loop runned

        System.out.println();

        //Acumulator: Is a variable which acumulates the value on each loop

        Scanner sc = new Scanner(System.in);
        int sum = 0; //Acumulator
        counter = 0; //Counter
        while (counter < 5){
            System.out.printf("Type a value:");
            int n = sc.nextInt();
            sum += n;  //adds more each loop
            counter++;
        }

        System.out.printf("Added %d times%n", counter);
        System.out.println("Sum: " + sum);

        System.out.println();

        //Sentinel: is variable typed by the user, what marks when the loop should stop

        

    }
}
