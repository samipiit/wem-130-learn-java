package learn_advanced.nested_loops;

public class LearnNestedLoops {

    public static void main(String[] args) {
//        for (int h = 0; h <= 12; h++) {
//            for (int m = 1; m <= 60; m++) {
//                for (int s = 1; s <= 60; s++) {
//                    System.out.printf("Hour = %d, Minute = %d, Second = %d\n", h, m, s);
//                }
//            }
//        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Executing outer loop #" + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.println("Executing inner loop #" + (j + 1));
            }

        }

    }

}
