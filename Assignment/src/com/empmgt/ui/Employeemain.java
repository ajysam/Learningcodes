package com.empmgt.ui;

import com.empmgt.entities.*;

public class Employeemain {

	public static void main(String[] args) {
		Employeemain work = new Employeemain();
		work.run();
	}

void run() {
	Employee store[]=new Employee[4];
	Department developerdepartment=new Department("1","Development Department");
	Department testerdepartment=new Department("2","Testing Department");
	Developer developmentemployee1=new Developer(1,"Jessica Kelistal Ruth",developerdepartment,"C++");
	Developer developmentemployee2=new Developer(2,"Ajay Samuel",developerdepartment,"Java");
	Tester testingemployee1=new Tester(3,"Albert Romeo",testerdepartment,"Spring tool");
	Tester testingemployee2=new Tester(4,"John Harris",testerdepartment,"Oracle");
	store[0]=developmentemployee1;
	store[1]=developmentemployee2;
	store[2]=testingemployee1;		
	store[3]=testingemployee2;

	
	for(int j=0;j<store.length;j++)
	{
		Employee iteratedemployee=store[j];
		boolean isadeveloper=iteratedemployee instanceof Developer;
		if (isadeveloper)
		{
			Developer developmentemployee=(Developer)iteratedemployee;
			displaydeveloperemployementdetails(developmentemployee);
		}
		boolean isatester=iteratedemployee instanceof Tester;
		if (isatester)
		{
			Tester testingemployee=(Tester)iteratedemployee;
			displayTestingemployeedetails(testingemployee);
		}
	}
	
}
	void displayemployeedetails(Employee store) {
		int id = store.getId();
		String name = store.getName();
		Department department = store.getDepartment();
		String deptid = department.getDeptid();
		String deptname = department.getDeptname();
		System.out.println("ID - " + id + " " + "Name - " + name);
		System.out.println("DeptId - " + deptid + " " + "DeptName - " + deptname);

	}

	void displaydeveloperemployementdetails(Developer store) {
		System.out.println("DEVELOPER");
		displayemployeedetails(store);
		String Language = store.getLanguage();
		System.out.println("Programming Language known - " + Language);
		System.out.println("***********************************************************");
	}

	void displayTestingemployeedetails(Tester store) {
		System.out.println("TESTER");
		displayemployeedetails(store);
		String tools = store.getTools();
		System.out.println("Testingtools known - " + tools);
		System.out.println("***********************************************************");
	}

}

