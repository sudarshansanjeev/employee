package com.assignment; 
import com.assignment.*;
import java.util.*;
public class EmpMain{
	static Scanner in=new Scanner(System.in);
	//static ArrayList<Emp> employeeList=new ArrayList<Emp>();
	//Emp employee[]=new Emp[100];
	public static int choiceException(){
		Scanner in=new Scanner(System.in);
		boolean ageCheck=true; int ch=0;
		do{
			ageCheck=true;
			try{
				System.out.println("Enter Choice:");		
				ch=in.nextInt();
			}
			catch(InputMismatchException e){
				System.out.println("Exception:Invalid Input");
				ageCheck=false;
			}
			in.nextLine();
			
		}while(ageCheck==false);
		return ch;
	}	
	public static void createEmployee(){
		int choice;
		do{
		System.out.println("---------------------");
		System.out.println(" 1.Clerk");
		System.out.println(" 2.Programmer");
		System.out.println(" 3.Manager");
		System.out.println(" 4.Exit");
		System.out.println("---------------------");
		choice=new InvalidChoiceException().readEmpChoice();	
		switch(choice){
			case 1: new Clerk();
				break;
			case 2:new Programmer();
				break;
			case 3:new Manager();
				break;
			case 4:break;
			default:System.out.println(" Enter Valid Choice");	
			}
		}while(choice!=4);
		
	}
	
	
	public static void main(String args[]){
		int choice;
		do{
			System.out.println("---------------------");
			System.out.println(" 1.Create");
			System.out.println(" 2.Display");
			System.out.println(" 3.Raise Salary");
			System.out.println(" 4.Delete");
			System.out.println(" 5.Exit");
			System.out.println("---------------------");
			//System.out.println(" Enter Choice:");
			choice=new InvalidChoiceException().readEmpChoice();
			switch(choice){
				case 1:	createEmployee();
					break;
				case 2:Emp.display();
					break;
				case 3:Emp.raiseSalary();
					break;
				case 4:Emp.delete();
				case 5:break;
				default:System.out.println(" Enter Valid Choice");
			}
		}while(choice!=5);
		System.out.println("Total Employee Count-------->"+Emp.employeeCount);
	}
}

/*
public static void displayEmployee(){
		System.out.println("*********DISPLAYING EMPLOYEE DETAILS**********");
		if(Emp.employeeCount==0)
			System.out.println("No Employees Available");
		else{
			System.out.println("Please Enter Sorting Order");
			System.out.println("1.Name");
			System.out.println("2.Age");	
			System.out.println("3.Salary");
			System.out.println("4.Designation");
			System.out.println("Enter your Choice of Display");
			short choice=new InvalidChoiceException().readDispChoice();
			switch(choice){
				case 1:Collections.sort(employeeList,new NameSorters());
					break;
				case 2:Collections.sort(employeeList,new AgeSorters());
					break;
				case 3:Collections.sort(employeeList,new SalarySorters());
					break;
				case 4:Collections.sort(employeeList,new DesignationSorters());
					break;
			}
			for(Emp e:employeeList)
				System.out.println(e);
		}
	}
*/