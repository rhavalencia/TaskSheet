package Task11;

public class Main {
    static int counter = 1;
    public static void main(String[] args) {
        Book[] newBooks = new Book[]{
            new Book("Java Programming", "John Smith", 2021, 39.99),
            new Book("Python Basics", "Jane Doe", 2020, 29.99),
            new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)
    };
    for (Book book : newBooks) {
        System.out.println("\nBook " + counter);
        System.out.println(book.toString());
        counter++;
    }
    }
}
