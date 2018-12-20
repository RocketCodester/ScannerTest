
import java.util.Scanner;

public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        doScannerTest("L|in|e |wi|t|h p|ipe|s r|e|mo|ved", "\\|");
        doScanTest("L|in|e |wi|t|h p|ipe|s r|e|mo|ved", "\\|");
        doScaningTest("L|in|e |wi|t|h p|ipe|s r|e|mo|ved", "\\|");
        Scanner reader = new Scanner(System.in);
    }

    public static void doScannerTest(String recordLine, String delim) {
        java.util.Scanner lineScanner = new java.util.Scanner(recordLine);
        lineScanner.useDelimiter(delim);
        while (lineScanner.hasNext()) {
            System.out.println(lineScanner.next());
        }
    }

    public static void doScanTest(String recordLine, String delim) {
        java.util.Scanner lineScanner = new java.util.Scanner(recordLine);
        lineScanner.useDelimiter(delim);
        while (lineScanner.hasNext()) {
            System.out.print(lineScanner.next());
        }
        System.out.println();
    }

    public static void doScaningTest(String recordLine, String delim) {
        java.util.Scanner lineScanner = new java.util.Scanner(recordLine);
        lineScanner.useDelimiter(delim);
        while (lineScanner.hasNext() ) {
            String temp = lineScanner.next();
            if(temp.equals(delim)){
                return;
            } else {
                System.out.print(temp);
            }
        }
        System.out.println();
    }

}
