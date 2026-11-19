package week01_basic_syntax.project;
import java.util.Scanner;

public class Main {
    public static void main(){

        //Tip calculator

        Scanner sc = new Scanner(System.in);

        double billValue;
        int clientNumber;
        double tip;

        System.out.println("What is the bill amount?");
        billValue = sc.nextDouble();

        System.out.println("How many people will pay?");
        clientNumber = sc.nextInt();

        System.out.println("What is the percentage of the tip? 0/100");
        tip = sc.nextDouble();

        double tipValue = billValue * tip / 100;
        double finalValue = billValue + tipValue;
        double paymentValue = Math.ceil(finalValue / clientNumber); //Math.ceil round the value up

        System.out.printf("The tip value is: %.2f%n", tipValue);
        System.out.printf("Bill final value: $%.2f%n", finalValue);
        System.out.printf("Value divided for the clients: $%.2f%n", paymentValue);

        sc.close();

    }
}
