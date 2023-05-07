package learn_basics.variables;

public class LearnVariables {

    String firstName = "Tinhinane";
    String lastName = "Smith";

    public static void main(String[] args) {
        LearnVariables obj = new LearnVariables();

        obj.printFirstName();
        obj.printLastName();
        obj.printFullName();
    }

    void printFirstName() {
        System.out.println(firstName);
    }

    void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void printLastName() {
        System.out.println(lastName);
    }

}
