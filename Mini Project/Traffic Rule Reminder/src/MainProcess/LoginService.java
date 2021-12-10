
package MainProcess;
import Database.MyConnection;
import java.sql.*;
public class LoginService 
{
    Connection con = null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    private int userid;
    private int password;

    public LoginService()
    {
        con=MyConnection.connect();
    }
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public int login(int id, int password)
    {
        setUserid(id);
        setPassword(password);
        try
        {
            pst=con.prepareStatement("SELECT * FROM userlogin WHERE User_ID =? and Password = ? ");
            pst.setInt(1,getUserid());
            pst.setInt(2,getPassword());
            rs=pst.executeQuery();
            if(rs.next())
                return 1;
            else
            return 0;
             
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return 0;
        }
        
    }
    
}
