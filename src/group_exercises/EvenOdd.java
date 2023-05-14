package group_exercises;

public class EvenOdd {

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();

        obj.printEvenNumbers();
        obj.printOddNumbers();
    }

    void printEvenNumbers() {
        int i = 1;

        while(i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }

    void printOddNumbers() {
        int i = 1;

        while(i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

            i++;
        }
    }

}
