import java.io.IOException;

public class Main {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //    public  static final String URL = "jdbc:mysql:\\127.0.0.1:3306\\academy";
    public static final String URL = "jdbc:mysql:\\localhost:3306\\academy";
    public static final String USER = "root";
    public static final String PASSWORD = "11n11n11n";

    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }
    }
}
