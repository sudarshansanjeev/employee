package com.assignment;
import com.assignment.Emp;
final public class Manager extends Emp{
	static int count=0;
	public Manager(){
		super("Manager",80000);
		//salary=80000;
		designation="Manager";
		Clerk.count++;
	}
	
}