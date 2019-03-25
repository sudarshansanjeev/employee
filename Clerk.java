package com.assignment;
import com.assignment.Emp;
final public class Clerk extends Emp{
	static int count=0;
	public Clerk(){
		super("Clerk",8000);
		designation="Clerk";
		count++;
	}
	
}