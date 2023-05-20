package group_exercises;

public class ReverseString {

    // Create a method to reverse any string

    public static void main(String[] args) {
        String str = "This is a string";
        System.out.println(reverseString(str));

    }

    // Traditional way to reverse strings

//    public static String reverseString(String strToReverse) {
//        char[] myArray = strToReverse.toCharArray();
//        int length = myArray.length;
//        char[] reversedArray = new char[length];
//
//        for (int i = 0; i < length; i++) {
//            reversedArray[length - 1 - i] = myArray[i];
//        }
//
//        return String.valueOf(reversedArray);
//    }

    // Reverse strings using StringBuilder

    public static String reverseString(String strToReverse) {
        char[] myArray = strToReverse.toLowerCase().toCharArray();
        int length = myArray.length;

        StringBuilder reversedString = new StringBuilder(length);

        for(int i = length - 1; i >= 0; i--) {
            reversedString.append(myArray[i]);
        }

        return reversedString.toString();
    }
}
