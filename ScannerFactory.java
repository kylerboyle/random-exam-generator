import java.util.*;

public class ScannerFactory {

    // creates only one system keyboard Scanner
    private static Scanner theScanner = null;

    // provides access to the only keyboard scanner
    public static Scanner getScanner() {
        if(theScanner == null) {
            theScanner = new Scanner(System.in);
        }

        return theScanner;
    }
    
    // close the scanner
    public void close() {
        theScanner.close();
        return;
    }
}
