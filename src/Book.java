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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 5) {
            System.out.println("");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public void updateCount() {
        this.borrowCount++;
    }

    public void capitalizeTitle() {
        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();
        for (String word : words) {
            capitalizedTitle.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        this.title = capitalizedTitle.toString().trim();
    }

    public void printBookInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println("Genre: " + genre);
        System.out.println("Borrow Count: " + borrowCount);
    }
}
