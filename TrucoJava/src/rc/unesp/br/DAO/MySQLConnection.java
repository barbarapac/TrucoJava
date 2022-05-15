package rc.unesp.br.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class to connect to the DataBase.
 * @author Dalton Lima @daltonbr
 * @author Bruno Vedovetto @bleandro
 * @author lucas Pinheiro @lucaspin
 */
public class MySQLConnection {
    /**
     * Returns the Connection to the DataBase
     */
    public static Connection getConnection(){
        Connection connection = null;

        String username = "root";
        String password = "123456";
        String urlBD = "jdbc:mysql://localhost/bd_truco";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(urlBD, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            return connection;
        }
    }
}
