

public final class ConnectionData {
    private final static String URL = "localhost:5432/dana";
    private final static String JDBC_URL = "jdbc:postgresql://" + URL;
    private final static String USER = "postgres";
    private final static  String PSWD = "learnjavaDana";

    private ConnectionData() {
    }

    public static String getJdbcUrl() {
        return JDBC_URL;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPswd() {
        return PSWD;
    }

}
