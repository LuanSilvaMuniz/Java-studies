package week02_flow_control.day06;

public class NestedIfStatements {
    public static void main(String[] args){

        // if inside other if

        int age = 18;
        boolean hasTicket = true;

        if (age >= 18) {
            if (hasTicket) { //this if is only tested if the outer one is true
                System.out.println("Welcome!");
            } else {
                System.out.println("Go buy a ticket");
            }
        } else {
            System.out.println("You are too young!");
        }

        //sometimes you can change nasted from &&

        if (age >= 18) {
            if (hasTicket) {
                System.out.println("Welcome!");
            }
        }

        // Equivalent but cleaner
        if (age >= 18 && hasTicket) {
            System.out.println("Welcome!");
        }
    }
}
