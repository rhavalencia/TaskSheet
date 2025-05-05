import java.util.Scanner;

public class ScoreToGrade implements Assignment{
    
    @Override
    public void activity(){
            System.out.println("Assignment 1: Score to Grade F - A");
            Scanner inputScanner = new Scanner(System.in);
            String grade = "";
            System.out.print("Score to evaluate: ");
            double score = inputScanner.nextInt();
            
            if(score >= 90 && score <= 100){
                grade = "A";
            }
    
            inputScanner.close();
            System.out.println("Grade: " + grade);
        
    }

}
