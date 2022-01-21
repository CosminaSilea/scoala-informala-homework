package jdbc.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static void main(String[] args) throws SQLException {
        Connection myConnection = connect("mysql", "localhost", "3306","booking", "root", "Root" );
        myConnection.close();
    }

    public static Connection connect (String type, String host, String port, String dbName, String user, String pw) {
        Connection conn = null;
        DriverManager.setLoginTimeout(60);
        try {
            String url = new StringBuilder()
                    .append("jdbc:")
                    .append(type)       // “mysql” / “db2” / “mssql” / “oracle” / ...
                    .append("://")
                    .append(host)
                    .append(":")
                    .append(port)
                    .append("/")
                    .append(dbName)
                    .append("?user=")
                    .append(user)
                    .append("&password=")
                    .append(pw).toString();
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }
        return conn;

    }
}
