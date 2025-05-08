import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Map<Integer, Activities> activities = new HashMap<>();
        activities.put(1, new Chapter2Task2());

        // Display available activity
        System.out.println("Choose an activity:");
        for (Map.Entry<Integer, Activities> entry : activities.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue().getClass().getSimpleName());
        }

        // Get user input
        System.out.print("\nEnter the number of the activity you want to do: ");
        int choice = scanner.nextInt();

        // Perform selected activity
        if (activities.containsKey(choice)) {
            activities.get(choice).chapterNumber();
        } else {
            System.out.println("Invalid choice! Please select a valid number.");
        }

        scanner.close();
    }
}
