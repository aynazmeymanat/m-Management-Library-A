import java.util.ArrayList;
import java.util.List;
 public class Member {
     private String memberId;
     private String name;
     private List<Book> borrowedBooks;
     private Address address;

     public Member(String memberId, String name, Address address) {
         if (memberId.length() == 6) {
             this.memberId = memberId;
         } else {
             System.out.println("Member ID Must be exactly 6 characters");
             System.exit(0);
         }
         this.name = name;
         this.borrowedBooks = new ArrayList<>();
         this.address = address;
     }

     public String getName() {
         return name;
     }

     public void borrowBook(Book book) {
         if (borrowedBooks.size() >= 3) {
             System.out.println("A maximum of 3 books can be borrowed");
             return;
         }
         if (!book.isAvailable()) {
             System.out.println(book.getTitle() + " not available");
             return;
         }
         borrowedBooks.add(book);
         book.setAvailable(false);
         System.out.println(book.getTitle() + "It was loaned");
     }

     public void returnBook(Book book) {
         if (borrowedBooks.remove(book)) {
             book.setAvailable(true);
             System.out.println(book.getTitle() + "withdrawn");
         } else {
             System.out.println(book.getTitle() + "Not found in the list");
         }
     }

     public void updateAddress(Address newAddress) {
         this.address = newAddress;
         System.out.println("address updated");
     }

     public void printMemberInfo() {
         System.out.println("Member ID: " + memberId);
         System.out.println("Name: " + name);
         System.out.print("Borrowed Books: ");
         if (borrowedBooks.isEmpty()) {
             System.out.println("No book has been borrowed");
         } else {
             for (Book book : borrowedBooks) {
                 System.out.print(book.getTitle() + " ");
             }
             System.out.println();
         }

 }}