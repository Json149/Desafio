package sv.edu.udb.desafio.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BDDConection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3308/discografia2";

    static final String USER = "root";
    static final String PASS = "";

    Connection conn = null;

    Statement stmt = null;
    PreparedStatement pstmt = null;

    ResultSet resultSet = null;

    public BDDConection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDDConection.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    public void connect() throws SQLException{

        conn = DriverManager.getConnection(DB_URL,USER,PASS);

    }

    public void close() throws SQLException{
        if(conn != null){
            conn.close();
            conn = null;
        }
    }
}
