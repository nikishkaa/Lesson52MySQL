import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Main {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //    public  static final String URL = "jdbc:mysql:\\127.0.0.1:3306\\academy";
    public static final String URL = "jdbc:mysql://localhost:3306/academy";
    public static final String USER = "root";
    public static final String PASSWORD = "11n11n11n";
    public static final String SELECT_ALL_CLASSES = "SELECT * FROM classes";


    public static void main(String[] args) {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException exception) {
            System.out.println(exception);
        }

//        try {
//            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//        } catch (SQLException exception) {
//            System.out.println(exception);
//        }


        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement = connection.createStatement();
            System.out.println(connection.getClass());

            ResultSet set = statement.executeQuery(SELECT_ALL_CLASSES);

            while (set.next()) {
                System.out.println(
                        set.getInt(1)
                                + ")" + set.getString(2)
                                + " " + set.getString(3)
                );
            }

        } catch (SQLException exception) {
            System.out.println(exception);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException exception) {
                    System.out.println(exception);
                }
            }
        }

    }

}
