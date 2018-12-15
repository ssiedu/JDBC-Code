
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddData {
public static void main(String[] args) {

    try{
    //step-1 (Driver Loading)
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver Loaded");
    //step-2 (Connection Establishment)
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data11", "root", "root");
    System.out.println("Successfully Connected");
    //step-3 (Draft an SQL Statement)
    String qr="insert into stud values(113,'ccc',90)";
    //step-4 (Dispatch/Send SQL Statement to DB for execution
    Statement stmt=con.createStatement();
    int n=stmt.executeUpdate(qr);
    //step-5 (Close the connection)
    con.close();
    System.out.println(n+" Record Added");
    
    }catch(ClassNotFoundException e){
        e.printStackTrace();
    }catch(SQLException e){
        e.printStackTrace();
    }
    
}
}
