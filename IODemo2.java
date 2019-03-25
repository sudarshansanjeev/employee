import java.io.*;

public class IODemo2{
	public static void main(String args[]){
		try{
			/*
			RandomAccessFile raf=new RandomAccessFile("abc.txt","rw");
			//raf.seek(5);
			//System.out.println(raf.readLine());
			raf.seek(raf.length());
			raf.writeBytes("JUST FOR DEMO ");
			raf.close();			
			*/
			//----------------------------
			/*
			
			//PrintWriter pw=new PrintWriter(System.in);
			PrintWriter pw=new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.println("Hello EveryBody");
			pw.flush();
			pw.close();
			*/
			//--------------------------
		
			File dir1=new File("abcd");
			dir1.mkdir();
			File dir2=new File(dir1,"xyza");
			dir2.mkdir();
			File f=new File(dir2,"atoza.txt");
			f.createNewFile();
			PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
			pw.println(args[0]);
			pw.flush();
			pw.close();
			
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}	