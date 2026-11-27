package week02_flow_control.day08;
import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args){

        //While and do-while execute one action many times while one condition is  true
        //While: The condition is tested before than each execution

        int i = 1;
        while (i <= 5) {
            System.out.printf("Value: %d%n", i);
            i++; //adds 1 to integer i
        }

        System.out.println();

        //Do-while the block executes first and only than the condition is tested

        i = 10;
        do {
            System.out.printf("Value: %d%n", i);
            i++;
        } while (i <= 5);

        System.out.println(i); //11 the value was added before the test

        //So we use do-while when we need to execute one action at least one time

        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1 - Play | 2 - Exit");
            option = sc.nextInt();
        } while (option != 2 );

        System.out.println();

        //Break and continue control

        i = 0;
        while (true) { //While (true) creates and infinity loop
            i++;
            if (i == 4) continue; //skips number 4
            if (i > 10) break; //stops when bigger than 10
            System.out.println(i);
        }

        //Continue ignores the rest of the code inside the braces and restart
        //Break stops the loop
    }
}
