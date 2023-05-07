package learn_basics.oops.polymorphism;

public class LearnPolymorphism {

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        double sum = myCalc.add(10.0, 5);
        System.out.println(sum); // 15

        // String.valueOf( ) - Example of overloaded method
    }
}
