package learn_basics.data_types;

public class LearnDataTypes {

    // Primitive Data Types
    // Numeric
    byte myByte = 127;
    short myShort = 32767;
    int myInt = 2_147_483_647;
    long myLong = 2_147_483_648L; //9223372036854775807
    float myFloat = 10.123f;
    double myDouble = 10.1234567890123456;
    // Non-Numeric
    char myChar = 'B';
    boolean isMorning = false;


    // Non-Primitive Data Types
    static String myStr = "%$#%^#(1245334ndcf'ksdio'jKJHGUFUY0-0=8--~`':]{|?/.,l*-";


    public static void main(String[] args) {
        LearnDataTypes obj = new LearnDataTypes();

        System.out.println(obj.myDouble);
    }

}
