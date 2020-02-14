import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PublisherService {

    public List<Publisher> getPublishers(Connection connection) throws SQLException {

        List<Publisher> publishers = new ArrayList<Publisher>();

        SelectStatement select = new SelectStatement(connection, "select * from publisher");
        ResultSet result = select.getResult();

        while (result.next()) {
            Publisher publisher = new Publisher();

            publisher.setId(result.getInt(1));
            publisher.setName(result.getString(2));
            publisher.setCountry(result.getString(3));
            publishers.add(publisher);
        }

        return publishers;
    }
}
