package Task10;

public class Student {
    private String firstName;
    private String lastName;
    
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    void printFullName(){
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
