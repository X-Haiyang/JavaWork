package j1123.sources;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class UtilsJDBC {

    //    @Test
    public static Connection getConnection() throws Exception {

        InputStream is = UtilsJDBC.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties pr = new Properties();

        pr.load(is);

        String url = pr.getProperty("url");
        String user = pr.getProperty("user");
        String password = pr.getProperty("password");
        String driverClass = pr.getProperty("driverClass");

        Class.forName(driverClass);

        Connection connection = DriverManager.getConnection(url, user, password);

        return connection;
    }

        public static void connectClose(Connection connection, Statement statement, ResultSet resultSet) {

        try {
            resultSet.close();
//            System.out.println("1");

            statement.close();
//            System.out.println("2");

            connection.close();
//            System.out.println("3");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("close ok");
    }

}
