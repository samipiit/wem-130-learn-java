package learn_basics.data_types;

public class LearnCasting {

    /*
    Casting means to convert a value of a certain data type to another data type
     */

    public static void main(String[] args) {
        // Primitive --> Primitive

//        int x = 200;
//
//        byte y = (byte) (x); // Narrowing (down-casting)
//        System.out.println(y); // -56
//
//        byte a = 127;
//        int b = a; // Widening (up-casting)
//        System.out.println(b);


        // Primitive --> Non-Primitive
//        int myAge = 20;
//        String age = String.valueOf(myAge);
//







        // Non-Primitive --> Primitive (Wrapper Classes - Each primitive data type has it's own respective wrapper class)
        String userAge = "203245234532456234453456";

        long ageOfUser = Long.valueOf(userAge);

        System.out.println(67.5 - ageOfUser);

    }

}
