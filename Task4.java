import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        String reversedInput = new StringBuilder(input).reverse().toString();

        if(input.equals(reversedInput)){
            System.out.println(input + " is a Palindrome");
        }else{
            System.out.println(input + " is not a Palindrome");
        }

        scanner.close();
    }
}
