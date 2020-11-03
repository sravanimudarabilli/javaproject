package com.cg.eis.pl;
import com.cg.eis.service.*;
import java.util.*;
public class EmployeScheme extends Scheme {
	// Scanner s=new Scanner(System.in);
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name:");
		name=s.next();
		System.out.println("enter id:");
		id=s.nextInt();
		System.out.println("enter Designation:");
		designation=s.next();
		System.out.println("enter salary:");
		salary=s.nextInt();
		scheme=employeeScheme(salary);
	}
	void display() {
		System.out.println("Employee name:"+name+" "+"Employ id:"+id);
		System.out.println("Employee Designation:"+designation+" "+"Employee salary:"+salary);
		System.out.println("Insurance sheme:"+scheme);
	}
	void search() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter id:");
		int s1=scan.nextInt();
		for(int i=0;i<2;i++) {
			if(s1==id) {
				System.out.println("Employee name:"+this.name+"" +"employee designation:"+this.designation+" "+"emplyee salary:"+this.salary+" "+"employee scheme:"+this.scheme);
			}
		}
	}
	public static void main(String[] args) {
		EmployeScheme[] obj=new EmployeScheme[10];
		String str="";
		for(int i=0;i<2;i++){

			obj[i]=new EmployeScheme();
			obj[i].accept();
			//obj[i].display();

		}
		for(int i=0;i<2;i++) {

			obj[i].display();
		}

		for(int i=0;i<2;i++) {
			obj[i].search();

		}
	}
}
