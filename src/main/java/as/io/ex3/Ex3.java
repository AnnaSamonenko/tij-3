package as.io.ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Modify Exercise 2 to also open a text file so you can write text into it.
 * Write the lines in the ArrayList, along with line numbers (do not attempt to use the “LineNumber” classes),
 * out to the file.
 * Modify Exercise 2 to force all the lines in the ArrayList to uppercase and send the results to System.out.
 */

public class Ex3 {

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
