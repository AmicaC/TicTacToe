import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        String[] fieldCaption = {"1", "2",  "3", "4", "5", "6", "7", "8", "9"};
        String playground = " " + fieldCaption[0] + " | " + fieldCaption[1] + " | " + fieldCaption[2] + "  \n" +
        "-----------\n" +
                " " + fieldCaption[3] + " | " + fieldCaption[4] + " | " + fieldCaption[5] + "  \n" +
                "-----------\n" +
                        " " + fieldCaption[6] + " | " + fieldCaption[7] + " | " + fieldCaption[8] + " \n";
            System.out.println(playground);
    }

}
