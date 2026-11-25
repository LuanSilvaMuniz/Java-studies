package week02_flow_control.day07;

public class Yield {
    public static void main(String[] args){

        //When the case needs more than one instruction we use {} and yield

        int month = 2;
        boolean leap = false;

        int days = switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                System.out.println("Verifying leap year....");
                yield leap ? 29 : 28; //yield returns the value to the switch
            }
            default -> throw new IllegalArgumentException(month + "is a invalid month");
        };

        System.out.println(days); //28
    }
}
