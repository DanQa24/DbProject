import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    private static Connection connection;


    public static Connection createConnection() throws SQLException{
        if(connection == null) {
            connection = DriverManager.getConnection(ConnectionData.getJdbcUrl(), ConnectionData.getUser(),
                    ConnectionData.getPswd());
        }
        return connection;
    }
}
