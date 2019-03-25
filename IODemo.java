import java.io.*;
public class IODemo{
	public static void main(String args[]){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name");
			String fname=br.readLine();
			
			//System.out.println("Enter age:");
			//int age = Integer.parseInt(br.readLine());
			
			//System.out.println("--------------------");
			
			//System.out.println("Your good name is "+name);
			//System.out.print("Your age after 10 yrs "+(age+10));
			
			File f=new File(fname);
			if(f.exists()){
				BufferedReader fr=new BufferedReader(new FileReader(fname));
				String line=null;
				while((line=fr.readLine)!=null)
					System.out.println(line);
				fr.close();		
			}
			else{
				System.out.println("Sorry! File doesn't exists");
			}
		br.close();		
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
}