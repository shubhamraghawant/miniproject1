
package ComplainRegister;
import Database.MyConnection;
import java.sql.*;
public class Submitvalues 
{
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int s;
    public Submitvalues() 
    {
        con = MyConnection.connect();
    }
    public void countdrink(int d)
    {
        s=d;
    }
public void submit(String detail)
{
    try
    {
            String query = " insert into violationdetails"
                                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
        pst= con.prepareStatement(query);
        pst.setString (1, detail);
        pst.setInt (2, s);
        pst.setInt (3, 0);
        pst.setInt (4, 0);
        pst.setInt (5, 0);
        pst.setInt (6, 0);
        pst.setInt (7, 0);
        pst.setInt (8, 0);
        pst.setInt (9, 0);
        pst.setInt (10, 0);
        

      // execute the preparedstatement
      pst.execute();
      
      con.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
    }
}

