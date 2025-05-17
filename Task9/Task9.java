package Task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Num 1: ");
        MathOps.num1 = inputScanner.nextInt();
        System.out.print("Num 2: ");
        MathOps.num2 = inputScanner.nextInt();

        System.out.println("Total: " + MathOps.add());
        System.out.println("Difference: " + MathOps.subtract());
        System.out.println("Product: " + MathOps.multiply());
        System.out.println("Qoutient: " + MathOps.divide());
        inputScanner.close();
    }
}
