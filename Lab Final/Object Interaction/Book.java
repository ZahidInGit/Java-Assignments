public class Book {
    int bookId;
    String title;
    double price;

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Price: $" + price;
    }
}
