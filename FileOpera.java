import java.io.*;
public class FileOpera{
    public static void main (String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("sample.txt");
            String str = "Welcome to java file Handling";
            byte[] data = str.getBytes();
            fout.write(data);
            fout.close();
            FileInputStream fin = new FileInputStream("sample.txt");
            int ch;
            while ((ch = fin.read()) != -1) {
                System.out.print((char)ch);
            }
            fin.close();
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}