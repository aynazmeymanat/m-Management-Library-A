import java.util.ArrayList;
import java.util.List;
    public class Library {
        private String name;
        private List<Book> books;
        private List<Member> members;

        public Library(String name) {
            this.name = name;
            this.books = new ArrayList<>();
            this.members = new ArrayList<>();
        }
        public void addBook(Book book) {
            books.add(book);
            System.out.println(book.getTitle() + " add to library");
        }

        public void addMember(Member member) {
            members.add(member);
            System.out.println(member.getName() + " Registered in the library");
        }

        public void borrowBook(Book book, Member member) {
            member.borrowBook(book);
            book.updateCount();
        }

        public void returnBook(Book book, Member member) {
            member.returnBook(book);
        }

        public void printLibraryInfo() {
            System.out.println("library " + name);
            System.out.println("books");
            for (Book book : books) {
                if (book.isAvailable())
                    book.printBookInfo();
            }
            System.out.println("member");
            for (Member member : members) {
                member.printMemberInfo();
            }
        }

        public List<Book> findBooksByAuthor(String authorName) {
            List<Book> booksByAuthor = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(authorName)) {
                    booksByAuthor.add(book);
                }
            }
            return booksByAuthor;
        }

    }
