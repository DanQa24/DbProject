import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List<Book> getBooks(Connection connection) throws SQLException {

        List<Book> books = new ArrayList<Book>();

        SelectStatement select = new SelectStatement(connection, "select * from book");
        ResultSet result = select.getResult();

        while (result.next()) {
            Book book = new Book();

            book.setBookId(result.getInt(1));
            book.setAuthorId(result.getInt(2));
            book.setTitle(result.getString(3));
            book.setIsbn(result.getString(4));
            books.add(book);
        }


        return books;
    }
}
