import java.util.Random;
import java.util.UUID;

public class App {
    //Create a class Book, for addition of book details.
    public class Book{
        //Add required fields such as bookId, bookName, writerName, price and quantity.
        int quantity;
        Random randNumber;
        String bookName, writerName, bookId;
        double price;


        public static void main(String[] args) throws Exception {
            //Colllection of books to store the book
            //an arrayList Of type book , that stores instances of books 
            Book[] books;

            //Make example book to see if thisd works

            //Add book to book list 
            
    
        }

        //Constructor to accept details for a specific book and store the same in an object of type Book.
        public Book(String bookName, String writerName, double price, int quantity){
            //insitialize fields of object 
            this.bookName = bookName;
            this.writerName = writerName;
            this.price = price;
            this.quantity = quantity;

            //Every time you add the details of a new book in your already present collection, generate a unique bookId for the same.
            String uniqueID = UUID.randomUUID().toString();
            this.bookId = uniqueID;

        }

    }

    
}
