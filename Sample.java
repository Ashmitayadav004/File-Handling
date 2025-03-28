package FilleHandling;

import java.io.*;

public class Sample {
    public static void main(String[] args) {
        try {
            byte[] b = new byte[10];
            System.out.println("Enter the num:");
            System.in.read(b);
            String s1 = new String(b);
            String s2 = s1.trim();
            int x = Integer.parseInt(s2);
            System.out.println(x);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
