package FilleHandling;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]); // opening file
            int n = fis.available();// know size of file
            byte[] b = new byte[n];// allocating size
            fis.read(b);
            FileOutputStream fos = new FileOutputStream(args[1], true);
            fos.write(b);
            fis.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}