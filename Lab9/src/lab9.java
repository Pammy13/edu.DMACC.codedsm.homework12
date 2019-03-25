import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab9 {


    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("a_text_file.txt");
        Scanner inFile = new Scanner(myFile);
        PrintWriter out = new PrintWriter("Hi_names.txt");
        while (inFile.hasNext()) {
            out.printf("Hi %s\n", inFile.next());
        }
        inFile.close();
        out.close();

        File hiNames = new File( "hi_names.txt");
        Scanner in2 = new Scanner(hiNames);
        while (in2.hasNext()){
            System.out.println(in2.nextLine());
        }
        in2.close();
    }
}
