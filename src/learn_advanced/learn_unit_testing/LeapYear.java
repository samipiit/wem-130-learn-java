package group_exercises;

public class LeapYear {

    /*
    Create a method that returns the number of days in a month, with the number of the month and year passed as
    arguments to the method

    Steps:
        1. Write a method getDaysInMonth() which accepts 2 parameters of type int, called month and year
        2. If the parameter month is <1 or >12, return -1
        3. If the parameter year is <1 or >9999, then return -1
        4. This method needs to return the number of days in a month
            Examples:
                - getDaysInMonth(1, 2020) - Returns 31, since Jan has 31 days
                - getDaysInMonth(2, 2020) - Returns 29
                - getDaysInMonth(2, 2021) - Returns 28
                - getDaysInMonth(-7, 2026) - Returns -1, since month is invalid
                - getDaysInMonth(2, -2020) - Returns -1, since year invalid
        5. Check for leap years
        5a. Write a method isLeapYear() accepting a parameter of type int named year
        6. The argument needs to be greater than or equal to 1 AND less than or equal to 9999
        7. If the argument is not in that range, return false
        8. If the argument is in the valid range, calculate if year is a leap year, and return true if it is, or
            return false otherwise

        HINT: A year is a leap year if it is evenly divisible by 4, but not by 100, or if it is evenly divisible by 400

        Examples:
            - isLeapYear(-1600) - Returns false
            - isLeapYear(1600)  - Returns true
            - isLeapYear(2022)  - Returns false
            - isLeapYear(2020)  - Returns true
     */


    public static void main(String[] args) {
        int days;

        days = getDaysInMonth(1, 2028); // 31
        System.out.println(days);

        days = getDaysInMonth(2, 2000); // 29
        System.out.println(days);

        days = getDaysInMonth(3, 1990); // 31
        System.out.println(days);

        days = getDaysInMonth(3, 2024); // 31
        System.out.println(days);

        days = getDaysInMonth(7, 1876); // 31
        System.out.println(days);

        days = getDaysInMonth(4, 2018); // 30
        System.out.println(days);

        days = getDaysInMonth(9, 2015); // 30
        System.out.println(days);

        days = getDaysInMonth(12, 1287); // 31
        System.out.println(days);

        days = getDaysInMonth(4, 2012); // 30
        System.out.println(days);

        days = getDaysInMonth(10, -2019); // -1
        System.out.println(days);

        days = getDaysInMonth(2, 1429); // 28
        System.out.println(days);

    }

    static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return -1;
        }

    }


    static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
