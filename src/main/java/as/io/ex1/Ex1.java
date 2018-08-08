package as.io.ex1;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Open a text file so that you can read the file one line at a time.
 * Read each line as a String and place that String object into a LinkedList.
 * Print all of the lines in the LinkedList in reverse order.
 */

public class Ex1 {

    private static final String PATH_STR = "files\\file1.txt";

    public static void main(String[] args) {
        List<String> listOfFileLine = new LinkedList<>();

        File path = new File(PATH_STR);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                listOfFileLine.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String str : listOfFileLine)
            System.out.println((new StringBuffer(str)).reverse());
    }

}
