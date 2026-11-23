package week02_flow_control.day06;

public class GuardClauses {

    // too many nasted if conditions forms a difficult to read ladder

    static void register(String name, int age, boolean acceptedTerms){

        if (name != null && !name.isEmpty()) {
            if (age >= 18) {
                if (acceptedTerms) {
                    System.out.println("Registered");
                } else {
                    System.out.println("Accept the terms");
                }
            } else {
                System.out.println("Must be 18+");
            }
        } else {
            System.out.println("Invalid name");
        }
    }

    //Guard clauses: treat the invalid cases first and exit with return

    static void guardClausesRegister(String name, int age, boolean acceptedTerms){

        if (name ==  null || name.isEmpty()) {
            System.out.println("Invalid name!");
            return;
        }

        if (age < 18) {
            System.out.println("Must be 18+");
            return;
        }

        if (!acceptedTerms) {
            System.out.println("Accept the terms!");
            return;
        }

        System.out.println("Registerd:" + name);
    }
}
