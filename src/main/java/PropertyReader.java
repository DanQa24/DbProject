import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private static Properties properties;

    public static Properties properties() {

        if(properties == null) {

            properties = new Properties();
            String dbPropFile = "/Users/dana/Projects/JdbcConnect.properties";

            try {
                FileReader reader = new FileReader(dbPropFile);
                properties.load(reader);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}
