import java.sql.Connection;

public class Main {
    public static void main(String args[]) {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection
        System.out.println("Using the Connection");


        // Return the connection:
        pool.checkIn(con);

    }
}