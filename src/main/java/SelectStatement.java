import java.sql.*;

public class SelectStatement {
    private Statement statement;
    private ResultSet result;

    public SelectStatement(Connection connection, String query) throws SQLException {
        statement = connection.createStatement();
        result = statement.executeQuery(query);
    }

    public ResultSet getResult() {
        return result;
    }


}
