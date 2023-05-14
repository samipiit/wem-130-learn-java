package learn_basics.control_flow;

public class LearnBranchingStatements {

    public static void main(String[] args) {
        String[] names = {"Eric", "Fatma", "Abdul", "Sabbir", "Tina", "Auooz", "Sami"};

        System.out.println("S1: " + getNameWithLetterS1(names)); // Sami
        System.out.println("S2: " + getNameWithLetterS2(names)); // Sabbir
        System.out.println("S3: " + getNameWithLetterS3(names)); // Sabbir
        System.out.println("S4: " + getNameWithLetterS4(names)); // Sami

    }


    // Method 1 - We are returning the last name that appears in an array that starts with "S"
    static String getNameWithLetterS1(String[] names){
        String nameToReturn = "";

        for(String name : names) {
            if (name.toLowerCase().startsWith("s")) {
                nameToReturn = name;
            }
        }

        return nameToReturn;
    }

    // Method 2 - We are returning the first name that appears in an array that starts with "S" using return keyword
    static String getNameWithLetterS2(String[] names){
        for(String name : names) {
            if (name.toLowerCase().startsWith("s")) {
                return name;
            }
        }

        return "";
    }

    // Method 3 - We are returning the first name that appears in an array that starts with "S" using break keyword
    static String getNameWithLetterS3(String[] names){
        String nameToReturn = "";

        for(String name : names) {
            if (name.toLowerCase().startsWith("s")) {
                nameToReturn = name;
                break;
            }
        }

        return nameToReturn;
    }

    // Method 4 - We are returning the last name that appears in an array that starts with "S" using continue keyword
    static String getNameWithLetterS4(String[] names){
        String nameToReturn = "";

        for(String name : names) {
            if (name.toLowerCase().startsWith("s")) {
                nameToReturn = name;
                continue;
            }

            System.out.println(name);

        }

        return nameToReturn;
    }


}
