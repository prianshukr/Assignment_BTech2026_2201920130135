abstract class Book {
    protected String title;
    protected String author;
    protected String ISBN;
    protected boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public abstract void displayInfo();

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
            return true;
        }
        System.out.println(title + " is not available.");
        return false;
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}
