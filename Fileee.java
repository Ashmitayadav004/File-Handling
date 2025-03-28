package FilleHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileee {
    public static void main(String[] args) {
        // code to create a file

        File myfile = new File("Ash.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        // code to write to a file

        try {
            FileWriter filewriter = new FileWriter("Ash.txt");
            filewriter.write("This is the first file from this java");
            filewriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Reading a file
        File myfilee = new File("Ash.txt");
        try {
            Scanner sc = new Scanner(myfilee);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // deleting

        File myfi = new File("Ashmi.txt");
        if (myfi.delete()) {
            System.out.println("I have deleted the file" + myfi.getName());
        } else {
            System.out.println("Some problem");
        }
    }
}
