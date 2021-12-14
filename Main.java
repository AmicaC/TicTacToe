import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] fieldCaption = {"1", "2",  "3", "4", "5", "6", "7", "8", "9"};
    static int counter = 0; 

    public static void main(String[] args) {
        while (true){
            printPlayground(fieldCaption);
            ersetzen();
            counter ++;
        }
    }

    public static void ersetzen() {
        int input = scanner.nextInt();
        System.out.println(input);
        if (fieldCaption[input-1] == "x" || fieldCaption[input-1] == "O") {
            System.out.println("Please enter an other number as this number is allready used!");
            ersetzen();
        }
        
        if (counter % 2 == 0) {
            fieldCaption[input-1] = "x";
        }
        else {
            fieldCaption[input-1] = "O";
        }
         

    }

    public static void printPlayground(String []fieldCaption) {
        String playground = " " + fieldCaption[0] + " | " + fieldCaption[1] + " | " + fieldCaption[2] + "  \n" +
        "-----------\n" +
                " " + fieldCaption[3] + " | " + fieldCaption[4] + " | " + fieldCaption[5] + "  \n" +
                "-----------\n" +
                        " " + fieldCaption[6] + " | " + fieldCaption[7] + " | " + fieldCaption[8] + " \n";
        System.out.println(playground);
    }
}
