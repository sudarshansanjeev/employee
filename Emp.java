package com.assignment;
import java.util.*;
import java.io.*;
import java.lang.Throwable;
import java.sql.*;
import com.assignment.InvalidAgeException;
public abstract class Emp{
	int id;
	public String name;
	public int age;
	public int salary;
	public String designation;
	public static int employeeCount=2;
	
	public Emp(String designation,int salary){
		this.designation=designation;
		this.salary=salary;
		System.out.println("Enter details of "+designation+":-");
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter ID");
		id=in.nextInt();
		System.out.println("\nEnter name");
		name=in.next();
		age=new InvalidAgeException().readEmpAge();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			PreparedStatement pstmt=con.prepareStatement("insert into EMPLOYEE values(?,?,?,?,?)");
			
			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setInt(3,age);
			pstmt.setInt(4,this.salary);
			pstmt.setString(5,this.designation);
			pstmt.execute();
			pstmt.close();
	
			con.close();
		}
		catch(Exception e){
			System.out.println(e);	
		}
		employeeCount++;
	}
	
	public static void delete(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			Statement stmt=con.createStatement();
			Scanner in=new Scanner(System.in);
			System.out.println("Enter Employee ID");
			int empID=in.nextInt();
			ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID="+empID);
			ResultSetMetaData rsmd=rs.getMetaData();

			int cols=rsmd.getColumnCount();
			if(!rs.next())
				System.out.println("NO RECORDS FOUND ID DOESNT EXIST"); 
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					System.out.println(rsmd.getColumnName(i)+":"+rs.getString(i));
				}
			}
			System.out.println("CONFIRM DELETE OF EMPLOYEE (YES/NO)");
			String confirm=in.next();
			if(confirm.equalsIgnoreCase("yes")){
				stmt.executeQuery("DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID="+empID);
				System.out.println("Employee Record Deleted");
			}
			
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);	
		}
	}
	public static void display(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM EMPLOYEE");
			ResultSetMetaData rsmd=rs.getMetaData();

			int cols=rsmd.getColumnCount();
			if(!rs.next())
				System.out.println("NO RECORDS FOUND"); 
			while(rs.next()){
				for(int i=1;i<=cols;i++){
					System.out.println(rsmd.getColumnName(i)+":"+rs.getString(i));
				}
			}
			
			rs.close();
			stmt.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);	
		}
	}
	public static void raiseSalary(){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
			Statement stmt=con.createStatement();
			stmt.executeQuery("UPDATE EMPLOYEE SET SALARY=SALARY+2000 WHERE DESIGNATION='Clerk'");
			stmt.executeQuery("UPDATE EMPLOYEE SET SALARY=SALARY+5000 WHERE DESIGNATION='Programmer'");
			stmt.executeQuery("UPDATE EMPLOYEE SET SALARY=SALARY+10000 WHERE DESIGNATION='Manager'");
			stmt.close();
			con.close();
			
		}
		catch(Exception e){
			System.out.println(e);			
		}	
	}

}






/*
final public static void display(Emp e){
		System.out.println("Name: "+e.name);
		System.out.println("Age: "+e.age);
		System.out.println("Designation: "+e.designation);
		System.out.println("Salary: "+e.salary);
		System.out.println("-----------------------------");
	}

public static int compare(Object obj1,Object obj2){
		Emp e1=(Emp)obj1;
		Emp e2=(Emp)obj2;

		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2); 	
	}
*/