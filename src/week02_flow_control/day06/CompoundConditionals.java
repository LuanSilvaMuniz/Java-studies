package week02_flow_control.day06;

public class CompoundConditionals {
    public static void main(){

        /*
            &&  AND  - true only if both conditions are true
            ||  OR   - true if at least one condition is true
            !   NOT  - reverses the boolean value
        */

        int number = 20;
        boolean isTrue = true;

        if(number >= 20 && isTrue){
            System.out.println("True");  // both of the conditions needs to be true
        }

        String word = "Word";
        if (word.equals("Word") || word.equals("Letter")) {
            System.out.println("Phrase"); // only one of the condition needs to be trune
        }

        boolean raining = false;
        if(!raining) {
            System.out.println("Its raining!"); // ! inverts the value of the boolean
        }

        // Procende

        boolean result = true || false && false; //Java solves && first
        //So here result = true

        int age = 18;
        boolean hasId = true;
        boolean isVip = true;

        if ((age >= 18 && hasId) || isVip) {
            System.out.println("Can enter");  //Can use parentheses for better understanding
        }

        /*  Procedence
            1 - !   NOT  - reverses the boolean value
            2 - &&  AND  - true only if both conditions are true
            3 - ||  OR   - true if at least one condition is true
        */
    }
}
