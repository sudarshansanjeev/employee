package com.assignment;
import java.util.*;

class NameSorters implements Comparator{
	public int  compare(Object obj1,Object obj2){
		Emp p1=(Emp)obj1;
		Emp p2=(Emp)obj2;
		
		String n1=p1.name;
		String n2=p2.name;
		
		return n1.compareTo(n2);
	}
}

class AgeSorters implements Comparator{
	public int  compare(Object obj1,Object obj2){
		Emp p1=(Emp)obj1;
		Emp p2=(Emp)obj2;
		
		Integer n1=p1.age;
		Integer n2=p2.age;
		
		return n1.compareTo(n2);
	}
}
class SalarySorters implements Comparator{
	public int compare(Object obj1,Object obj2){
		Emp p1=(Emp)obj1;
		Emp p2=(Emp)obj2;
		Integer salary1=p1.salary;
		Integer salary2=p2.salary;
		
		return salary1.compareTo(salary2);
	}
}
class DesignationSorters implements Comparator{
	public int compare(Object obj1,Object obj2){
		Emp p1=(Emp)obj1;
		Emp p2=(Emp)obj2;
		String designation1=p1.designation;
		String designation2=p2.designation;
		
		return designation1.compareTo(designation2);
	}
}		
class NameSortersDesc implements Comparator{
	public int  compare(Object obj1,Object obj2){
		Emp p1=(Emp)obj1;
		Emp p2=(Emp)obj2;
		
		String n1=p1.name;
		String n2=p2.name;
		
		return n2.compareTo(n1);
	}
}