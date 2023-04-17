package persistencia;

import java.sql.*;

public class DAO {

    protected Connection connection;
    protected Statement statement;
    protected ResultSet resultset;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/tienda?useSSL=false";

    protected void ConectarBD() throws Exception {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new Exception("Error al conectarse");
        }
    }

    protected void DesconectarBD() throws Exception {

        try {
            if (statement != null) {
                statement.close();
            }
            if (resultset != null) {
                resultset.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new Exception("Error al desconectarse");
        }
    }

    protected void QueryBD(String sql) throws Exception {
        try {
            ConectarBD();
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new Exception("Error al consultar");
        }
    }

}
