import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.print("Enter a number: ");
            numbers[counter] = scanner.nextInt();
        }

        System.out.println("Your numbers are: " + java.util.Arrays.toString(numbers));

        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("All numbers are equal.");
        } else {
            int largest = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }
            System.out.println("The largest number is: " + largest);
        }

        scanner.close();

    }
}
