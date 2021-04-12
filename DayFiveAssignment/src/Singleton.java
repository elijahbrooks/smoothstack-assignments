import java.sql.*;

/**
 * @author elijahbrooks
 */
public class Singleton {
    private static Connection conn = null;
    private static final Singleton instance = new Singleton();
    /**
     *
     * @return single Singleton instance
     */
    public static Singleton getInstance(){
        return instance;
    }

    /**
     *
     * @param input
     * @throws SQLException
     */
    public static void databaseQuery(Integer input) throws SQLException {
        conn = DriverManager.getConnection("url of database");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select id from table");
        int x = 0;
        while(rs.next()){
            x = rs.getInt(1) * input;
        }
    }

}
