class Book {
    static String libraryName = "Chitkara Library";
    private String title;
    private String author;
    final String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    public static void main(String[] args) {
        displayLibraryName();

        Book book1 = new Book("Think Again", "Adam Grant", "1234567890");
        Book book2 = new Book("1984", "George Orwell", "0987654321");

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
