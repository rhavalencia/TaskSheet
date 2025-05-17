package Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        BasicArithmetic ba = new BasicArithmetic();
        
        System.out.print("1st Number: ");
        float num1 = inputScanner.nextFloat();
        System.out.print("2nd Number: ");
        float num2 = inputScanner.nextFloat();
        
        System.out.println("Sum: " + ba.add(num1, num2));
        System.out.println("Difference: " + ba.subtract(num1, num2));
        System.out.println("Product: " + ba.multiply(num1, num2));
        System.out.println("Qoutient: " + ba.divide(num1, num2));
        inputScanner.close();
    }
}
