package learn_basics.immutability;

public class LearnStringImmutability {

    public static void main(String[] args) {

        /*
         String pool
            Contains each string object that is initialized during runtime

         String Immutability/Interning
            Cannot change something once its declared
         */

        String str1 = "Hello, world";
        String str2 = "Hello, world";

        System.out.println("String equality: " + str1.equals(str2)); // true
        System.out.print("Reference equality: ");
        System.out.print(str1 == str2);// true

        System.out.println();

        String str3 = new String("Hello, world");
        String str4 = str3.intern();
        String str5 = "Hello, world";

        System.out.println("String equality: " + str3.equals(str4)); // true
        System.out.print("Reference equality: ");
        System.out.print(str5 == str4); // true

    }

}
