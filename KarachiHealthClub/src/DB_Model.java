import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class DB_Model {
    Connection con;
    Statement st;
    ResultSet rs;
    
    public DB_Model(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karachi_health_club", "root", "");
//        System.out.println("Database is Connected");
        st = con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void register(String name, String email, String contact, String password, String age, String gender){
        String sql = "INSERT INTO REGISTER (`R_Id`, `R_Name`, `R_Email`, `R_Contact`, `R_Password`, `R_Age`, `R_Gender`) Values (Null, '"+name+"', '"+email+"', '"+contact+"', '"+password+"', '"+age+"', '"+gender+"')";
        try{
            st.executeUpdate(sql);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
