package Task11;


class Book{
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String toString(){
        return "Title: " + title
        + "\nAuthor: " + author
        + "\nYear Published: " + yearPublished
        + "\nPrice: $" + price;
    }
}