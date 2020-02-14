
public final class ConnectionData {
    private ConnectionData() {}


    public static String getJdbcUrl() {
        return PropertyReader.properties().getProperty("jdbcUrl");
    }

    public static String getUser() {
        return PropertyReader.properties().getProperty("user");
    }

    public static String getPswd() {
        return PropertyReader.properties().getProperty("pswd");
    }

}
