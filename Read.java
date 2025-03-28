package FilleHandling;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]); // opening file
            int n = fis.available();// know size of file
            byte[] b = new byte[n];// allocating size
            fis.read(b);
            String s = new String(b);
            System.out.println(s);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + args[0]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
