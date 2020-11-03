package task3;
import java.util.*;
class Phone{
	String phid;
	String phtype;
	int phnum;
	String phno[];
}
public class Employee extends Phone{
	String empname;
	int empid;
	void accept() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee name:");
		empname=s.nextLine();
		System.out.println("enter employee id:");
		empid=s.nextInt();
		System.out.println("enter phone id:");
		phid=s.nextLine();
		System.out.println("enter phone type:");
		phtype=s.nextLine();
		System.out.println("enter number of mobile numbers:");
		phnum=s.nextInt();
		phno=new String[phnum+1];
		System.out.println("enter mobile number:");
		//System.out.println(phno.length+phnum);
		for(int i=0;i<=phnum;i++) {
			phno[i]=s.nextLine();
		}

	}
	void display() {
		System.out.println("Employee name:"+empname+" "+"Employee id:"+empid);
		System.out.println("phone id:"+phid+" "+"phone type"+phtype+" "+"number of phone numbers:"+phnum);
		System.out.println("employee phone numbers:");

		for(int i=0;i<=phnum;i++) {
			System.out.println(phno[i]);
		}
	}

	public static void main(String[] args) {
		Employee obj=new Employee();
		Employee ob1=new Employee();
		obj.accept();
		obj.display();
		ob1.accept();
		ob1.display();
	}
}
