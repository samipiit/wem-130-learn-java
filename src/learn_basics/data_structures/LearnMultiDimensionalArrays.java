package learn_basics.data_structures;

public class LearnMultiDimensionalArrays {

    public static void main(String[] args) {
        String[][] data = new String[5][3];

        String[] firstRow = data[0];
        firstRow[0] = "Sofiane";
        firstRow[1] = "23";
        firstRow[2] = "QA Dev";

        String[] secondRow = data[1];
        secondRow[0] = "Fatma";
        secondRow[1] = "28";
        secondRow[2] = "Software Dev";

        data[2][0] = "Sabbir";
        data[2][1] = "21";
        data[2][2] = "Help Desk";

        data[3][0] = "Tina";
        data[3][1] = "26";
        data[3][2] = "Cloud Engineer";

        data[4][0] = "Salim";
        data[4][1] = "25";
        data[4][2] = "React.js Developer";
















        System.out.println(data[3][2]);
    }

}
