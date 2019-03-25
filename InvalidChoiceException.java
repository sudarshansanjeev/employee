package com.assignment;
import java.lang.Throwable;
import java.util.*;
class InvalidChoiceException extends Exception{
	InvalidChoiceException(){
	}
	InvalidChoiceException(String msg){
		super(msg);
	}
	public int readEmpChoice(){
		int choice=0;
		while(true){
			try{
				System.out.println("Enter Choice:");
				choice=new Scanner(System.in).nextInt();
				return choice;
			}
			catch(InputMismatchException e){
				System.out.println("Please Enter Valid Choice");
			}
		}
	}
	public byte readDispChoice(){
		byte choice=0;
		while(true){
			try{
				System.out.println("Enter Displaying Choice");
				choice=new Scanner(System.in).nextByte();
				return choice;
			}
			catch(InputMismatchException e){
				System.out.println("Please Enter Valid Choice");
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