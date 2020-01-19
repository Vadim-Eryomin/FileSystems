import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static String read() {
        try {
            FileReader read = new FileReader("Chet.txt");
            Scanner scan = new Scanner(System.in);
            String reading = "";
            reading += scan.nextLine() + "\n";
            return reading;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "";
    }
}
