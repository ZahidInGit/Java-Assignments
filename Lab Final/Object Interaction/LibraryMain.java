public class LibraryMain {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(1, "Java Programming", 600.0);
        books[1] = new Book(2, "Data Structures", 450.0);
        books[2] = new Book(3, "Algorithms", 700.0);
        books[3] = new Book(4, "Web Design", 300.0);
        books[4] = new Book(5, "AI Principles", 900.0);

        System.out.println("--- Books priced > 500 ---");
        double totalPrice = 0;
        
        for (Book b : books) {
            if (b.price > 500) {
                System.out.println(b);
            }
            totalPrice += b.price;
        }

        double average = totalPrice / books.length;
        System.out.println("\nAverage Price of all books: $" + average);
    }
}
