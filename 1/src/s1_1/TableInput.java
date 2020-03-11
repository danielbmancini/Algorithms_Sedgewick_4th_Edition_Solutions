package s1_1;

import java.util.ArrayList;
import java.util.Scanner;
/*
    exercise 1.1.21
 */

public class TableInput {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> lines = new ArrayList<>();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        createTable();
    }
    private static void createTable() //input should be "(name) (integer) (integer)" or -1
    {
        lines.add("\n");
        while (true){
            double c;
            System.out.println("\nInput a line, or \"-1\" to halt.");
            String line = scanner.next();
            if (line.equals("-1"))
                break;
            String[] tokens = line.split(" ");
            if (tokens.length != 3){
                System.out.println("Bad input.");
                break;
            }
            try {
               int a = Integer.parseInt(tokens[1]);
               int b = Integer.parseInt(tokens[2]);
               c = (double) a/b;

            }catch (NumberFormatException e)
            {
                System.out.println("Bad Input.");
                break;
            }
            lines.add(String.format("%n%s %.3f",line,c));
        }
        lines.forEach(System.out::print);
    }
}
