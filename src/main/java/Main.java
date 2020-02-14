import java.io.IOException;
import java.sql.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException, IOException {

      Connection connection = ConnectionFactory.createConnection();

      PublisherService publisherService = new PublisherService();
        List<Publisher> publishers = publisherService.getPublishers(connection);

        for(Publisher publisher : publishers) {
            System.out.println(publisher);
        }

        System.out.println();

        BookService bookService = new BookService();
        List<Book> books = bookService.getBooks(connection);

        for (Book book : books) {
            System.out.println(book.getBookId() + " " + book.getTitle() + " " + book.getIsbn());
        }

    }
}
