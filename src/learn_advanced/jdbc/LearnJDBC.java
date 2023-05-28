package learn_advanced.jdbc;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class LearnJDBC {

    /*
    JDBC Driver
    Server Address
    Username = root
    Password
     */

    private static Properties prop;
    private static Connection connection;

    public static void main(String[] args) {
        connection = getJDBCConnection();

        if (connection != null) {
            System.out.println("WE SUCCESSFULLY ESTABLISHED A JDBC CONNECTION!");
        }

        String query = "SELECT * FROM CITY";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            List<List<String>> results = new ArrayList<>();

            while (resultSet.next()) {
                List<String> row = new ArrayList<>();

                for (int i = 1; i <= columnCount; i++) {
                    row.add(resultSet.getString(i));
                }

                results.add(row);
            }

            for (List<String> row : results) {
                for (String value : row) {
                    System.out.print(value + "\t|");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection getJDBCConnection() {
        prop = loadProperties();

        if (prop != null) {
            String driverClass = prop.getProperty("MYSQLJDBC.driver");
            String host = prop.getProperty("MYSQLJDBC.host");
            String user = prop.getProperty("MYSQLJDBC.userName");
            String password = prop.getProperty("MYSQLJDBC.password");

            try {
                Class.forName(driverClass);
            } catch (ClassNotFoundException cnfe) {
                cnfe.printStackTrace();
            }

            try {
                connection = DriverManager.getConnection(host, user, password);
            } catch (SQLException sqle) {
                System.out.println("Unable to establish connection to MYSQL database!");
            }

        } else {
            System.out.println("Properties object is null");
        }
        return connection;
    }

    private static Properties loadProperties() {
        prop = new Properties();
        String propFilePath = System.getProperty("user.dir") + File.separator + "config" + File.separator + "secret.properties";

        try (InputStream ism = new FileInputStream(propFilePath)) {
            prop.load(ism);
        } catch (FileNotFoundException fnfe) {
            System.out.println("FILE IS NOT AVAILABLE AT: " + propFilePath);
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }

        return prop;
    }

}
