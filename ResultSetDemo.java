import java.sql.*;
public class ResultSetDemo{
	public static void main(String args[]){
		try{
			BufferdReader br=new BufferedReader(new InputStreamReader(System.in));

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			Statement stmt=con.createStatement(Result.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs=stmt.executeQuery("select * from EMP");
			while(rs.next()){
				System.out.println("Name:"+rs.getString(1));
				System.out.println("Age:"+rs.getInt(2));
				System.out.println();
			}
			while(rs.previous()){
				System.out.println("Name:"+rs.getString(1));
				System.out.println("Age:"+rs.getInt(2));
				System.out.println();
			}
			while(rs.absolute(5)){
				System.out.println("Name:"+rs.getString(1));
				System.out.println("Age:"+rs.getInt(2));
				System.out.println();
			}
			System.out.println("-----------------------");
			stmt.close();
			con.close();
			
		}
		catch(Exception e){
			System.out.println(e);			
		}	
	}
}