package learn_basics.enums;

public class LearnEnum {

    static String directionToGo = "NORTH";

    public static void main(String[] args) {
        Direction[] values = Direction.values();
        for (Direction d : values) {
            System.out.println(d);
        }

        System.out.println(Direction.valueOf(directionToGo));
    }

}
