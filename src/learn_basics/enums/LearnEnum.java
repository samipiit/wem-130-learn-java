package learn_basics.enums;

public class LearnEnum {

    public static void main(String[] args) {
        System.out.println(Month.JULY.num);

        System.out.println(determineMonthNumber(Month.FEBRUARY));

    }

    public static int determineMonthNumber(Month month) {
        switch(month) {
            case JANUARY:
                return 1;
            case FEBRUARY:
                return 2;
            case MARCH:
                return 3;
            case APRIL:
                return 4;
            case MAY:
                return 5;
        }
        return -1;
    }

}
