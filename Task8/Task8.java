package Task8;

import java.util.ArrayList;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<Integer> argsList = new ArrayList<Integer>();
        System.out.print("Number of arguments: ");
        int numOfArgs = inputScanner.nextInt();

        for (int counter = 1; counter <= numOfArgs; counter++) {
            System.out.print("Argument " + counter + ": ");
            argsList.add(inputScanner.nextInt());
        }

        int[] argsListArray = argsList.stream().mapToInt(i->i).toArray();
        CumulativeSum.calculate(argsListArray);

        // System.out.print("1st Argument: ");
        // int num1 = inputScanner.nextInt();
        // System.out.print("2nd Argument: ");
        // int num2 = inputScanner.nextInt();
        // System.out.print("3rd Argument: ");
        // int num3 = inputScanner.nextInt();

        // CumulativeSum.calculate(num1, num2, num3);

        inputScanner.close();
    }
}
