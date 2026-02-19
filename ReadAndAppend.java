import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadAndAppend {
    public static void main(String[] args) {

        // -------- Reading Existing File --------
        System.out.println("Old File Content:\n");

        try (FileReader fr = new FileReader("data.txt")) {

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }

        // -------- Adding New Data (Append Mode) --------
        try (FileWriter fw = new FileWriter("data.txt", true)) { // true = append
            fw.write("\nNew data added by program.");
            System.out.println("\n\nNew data added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}