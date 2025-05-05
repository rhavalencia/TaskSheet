import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Assignment> assignments = new HashMap<>();
        assignments.put(1, new ScoreToGrade());
        assignments.put(2, new NumberToMonth());
        // assignments.put(3, "Number to day of the week");
        // assignments.put(4, "Odd or Even?, Positive or Negative? of Zero");
        // assignments.put(5, "Sum of all integer inputs");
        // assignments.put(6, "Integer input from the user to generate pattern");
        // assignments.put(7, "Multiplication Table");
        // assignments.put(8, "String Methods");
        // assignments.put(9, "Check vowels and consonants");
        // assignments.put(10, "Count number of words");
        // assignments.put(11, "String bulder");
        // assignments.put(12, "Sum and Average of input array");

        // Display available assignments
        System.out.println("Choose an assignment:");
        for (Map.Entry<Integer, Assignment> entry : assignments.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getClass().getSimpleName());
        }

        // Get user input
        System.out.print("\nEnter the number of the activity you want to do: ");
        int choice = scanner.nextInt();

        // Perform selected activity
        if (assignments.containsKey(choice)) {
            assignments.get(choice).activity();
        } else {
            System.out.println("Invalid choice! Please select a valid number.");
        }

        scanner.close();

    }

}