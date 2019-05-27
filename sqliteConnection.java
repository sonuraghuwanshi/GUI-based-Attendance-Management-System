package Codes;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class sqliteConnection {
    Connection conn=null;
    public static Connection dbconnector()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\SQLiteStudio\\Attendance.sqlite");
            //JOptionPane.showMessageDialog(null,"Connection successful");
            return conn;
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}