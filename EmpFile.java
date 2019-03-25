package com.assignment;
import java.io.*;
class EmpFile{
	/*public static Emp receive(Emp e){
		return Emp;	
	}*/
	public static void main(String args[]){
		try{
		String fileName="EmployeeRecords.txt";
		File f=new File("EmployeeRecords.txt");
		if(f.exists()){
			
		}
		else
			f.createNewFile();
		
		Emp e=new Clerk();
		//PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
		//pw.println("");
		//pw.append(e.name+"|"+e.age+"|"+e.salary+"|"+e.designation);
		//pw.flush();
		//pw.close();
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		String line=null;
		while((line=br.readLine())!="\n")
			{
				String str[]=line.split("|");
				System.out.println("Name:"+str[0]);
				System.out.println("Age:"+str[1]);
				System.out.println("Salary:"+str[2]);
				System.out.println("Designation:"+str[3]);
				for(String s:str)
				System.out.println(s);
			}
		br.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}