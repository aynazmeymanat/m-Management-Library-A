public class Book {
        private String id;
        private String title;
        private String author;
        private boolean isAvailable;
        private Genre genre;
        private int borrowCount;

    public Book(String id, String title, String author, Genre genre) {
        if (id.length() == 5) {
            this.id = id;
        } else {
            System.out.println("invalid");
            System.exit(0);
        }
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.borrowCount = 0;
    }
}
