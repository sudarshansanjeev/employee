package com.assignment;
import java.lang.Throwable;
import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(){
	}
	InvalidAgeException(String msg){
		super(msg);
	}
	public int readEmpAge(){
		int age=0;
		while(true){
			try{
				System.out.println("Enter age:");
				age=new Scanner(System.in).nextInt();
				if(age<21||age>60)
					throw new InvalidAgeException("Valid Age betweeen 21-60");
				return age;
			}
			catch(InputMismatchException|InvalidAgeException e){
				System.out.println("Please Enter Valid Age");
			}
		}
	}
}

/*
public static int ageException(){
		Scanner in=new Scanner(System.in);
		boolean ageCheck=true; int ageTemp=0;
		do{
			ageCheck=true;
			try{
				System.out.println("Enter age:");		
				ageTemp=in.nextInt();
				if(!(ageTemp>=21&&ageTemp<=60)){
					throw new InvalidAgeException("Valid age between 21-60");
				}
			}
			catch(InvalidAgeException e){
				System.out.println("Exception:"+e.getMessage());
				ageCheck=false;
			}
			catch(InputMismatchException e){
				System.out.println("Exception:Invalid Age");
				ageCheck=false;
			}
			in.nextLine();
			
		}while(ageCheck==false);
		return ageTemp;
	}	*/