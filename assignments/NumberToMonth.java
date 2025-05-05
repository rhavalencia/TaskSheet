import java.util.Scanner;

public class NumberToMonth implements Assignment {

    @Override
    public void activity() {
        System.out.println("Assignment 2: Number to month (1-12) and print number of days of that month");
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int month = inputScanner.nextInt();
        inputScanner.close();
        
        int numberOfDays = 0;
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "January";
            case 3:
                monthName = "March";
            case 5:
                monthName = "May";
            case 7:
                monthName = "July";
            case 8:
                monthName = "August";
            case 10:
                monthName = "October";
            case 12:
                monthName = "December";
                numberOfDays = 31;
                break;
            case 4:
                monthName = "April";
            case 6:
                monthName = "June";
            case 9:
                monthName = "September";
            case 11:
                monthName = "November";
                numberOfDays = 31;
                break;
            case 2:
                monthName = "February";
                numberOfDays = 28;
                break;
            default:
                System.out.println("Invalid Input");
                return;
        }

        System.out.println(monthName + " has " + numberOfDays + " days");
    }

}
