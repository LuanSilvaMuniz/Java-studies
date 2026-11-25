package week02_flow_control.day07;

public class SwitchExpression {
    public static void main(String[] Args){

        /*
        Switch expression have some differences
        - do not have fall  through
        - can have more than one value per case
        - no break
         */

        //when execute one day it does not go to the next case.

        String day = "Saturday";
        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> //here we have five values in one case
                    System.out.println("Weekday");
            case "sunday", "saturday" -> System.out.println("Weekend");
            default -> System.out.println("Not a day");
        } //saturday
    }
}
