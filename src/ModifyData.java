
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModifyData {
public static void main(String[] args) throws Exception {
   Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data11", "root", "root");
   Statement stmt=con.createStatement();
   int n=stmt.executeUpdate("update stud set marks=marks+3");
   System.out.println(n+" records modified");
   con.close();
}
}
