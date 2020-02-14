
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public final class ConnectionData {
    private ConnectionData() {}

    public static String getJdbcUrl() {
        return properties().getProperty("jdbcUrl");
    }

    public static String getUser() {
        return properties().getProperty("user");
    }

    public static String getPswd() {
        return properties().getProperty("pswd");
    }


    private static Properties properties() {
        Properties properties = new Properties();
        String dbPropFile = "/Users/dana/Projects/JdbcConnect.properties";
        try {
            FileReader reader = new FileReader(dbPropFile);
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
