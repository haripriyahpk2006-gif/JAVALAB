import java.io.*;

public class FileOperation {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Hello! This is a Java file operation program.");
            fw.write("\nFile handling includes open, read, write and close.");
            fw.close();
            FileReader fr = new FileReader("sample.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}