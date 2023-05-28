package learn_advanced.fileIO;

import java.io.*;

public class LearnTextIO {
    public static void main(String[] args) {
        /*
        Absolute = From the root
        Relative =
         */

        String userDir = System.getProperty("user.dir");
        String filePath = userDir + File.separator + "config_files" + File.separator + "helloworld.txt";
        File txtFile = new File(filePath);

        // Input from a file
        try {
            FileReader fr = new FileReader(txtFile);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // Output to a file
        try (FileWriter fw = new FileWriter(txtFile)) {
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("This is a nested try-with-resources block");
                bw.newLine();
                bw.write("It is used to create multiple resources, some of which are dependant on others");
                bw.flush();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
