package com.assignment;
import com.assignment.Emp;
final public class Programmer extends Emp{
	static int count=0;
	public Programmer(){
		super("Programmer",50000);
		//salary=50000;
		designation="Programmer";
		count++;
	}
	
}