/*
Simple program that takes a (source) file and outputs it to another file with numbered lines.

*/


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineCounter {

    public static void getLines(final String source_path) throws IOException {
        File sourceFile = new File(source_path);
        Scanner scanner = new Scanner(sourceFile);

        final StringBuilder fileContent = new StringBuilder("");
        int lineCounter = 1;

        while (scanner.hasNextLine()) {
            fileContent.append(lineCounter).append(". ").append(scanner.nextLine()).append("\n");
            lineCounter++;
        }

        FileWriter outputFile = new FileWriter("formated_source_code.txt");
        outputFile.write(fileContent.toString());
        outputFile.close();
    }
}

/* ============= Exemple based on code above ===================
Output file:
      1. import java.io.File;
      2. import java.io.FileNotFoundException;
      3. import java.io.FileWriter;
      4. import java.io.IOException;
      5. import java.util.Scanner;
      6. 
      7. public class LineCounter {
      8. 
      9.     private String SOURCE_PATH = "";
      10.     private final StringBuilder fileContent = new StringBuilder("");
      11. 
      12.     public LineCounter(String source_path) throws FileNotFoundException {
      13.         this.SOURCE_PATH = source_path;
      14.     }
      15. 
      16.     File sourceFile = new File(SOURCE_PATH);
      17.     Scanner scanner = new Scanner(sourceFile);
      18. 
      19.     public void getLines() throws IOException {
      20.         int lineCounter = 1;
      21.         while (scanner.hasNextLine()) {
      22.             fileContent.append(lineCounter).append(". ").append(scanner.nextLine()).append("\n");
      23.         }
      24.         FileWriter outputFile = new FileWriter("formated_source_code.txt");
      25.         outputFile.write(fileContent.toString());
      26.         outputFile.close();
      27.     }
      28. }
*/ 
