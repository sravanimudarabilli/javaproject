
package task3;
import java.util.List;
class Phone1{
	String phone_id;
	String phone_type;
	int numphones;
	String phone_no;
	Phone1(String phone_id,String phone_type,int numphones,String phone_no){
		this.phone_id=phone_id;
		this.phone_type=phone_type;
		this.numphones= numphones;
		this.phone_no=phone_no;
		
	}
}
public class Employee1 {
String ename;
int id;
List<Phone1> phone_details;

public Employee1(String ename,int id,List<Phone1> phone_details) {
	this.ename=ename;
	this.id=id;
	this.phone_details=phone_details;
	
}
void display() {
System.out.println("employee name:"+ename+" "+"employ id:"+id);
System.out.println("phone id:"+phone_details.phone_id+" "+"phone type:"+phone_details.phone_type+" "+"number of phones:"+phone_details.numphones+"phone number:"+phone_details.phone_no);
}
	public static void main(String[] args) {
		Phone1 p=new Phone1("ID000749","mobile",1,"9898989898");
		Phone1 p1=new Phone1("ID000459","lanline",2,"984802238") ;
		List<Phone1> l1;
		l1.add(p);
		l1.add(p1);
	Employee1 obj=new Employee1("sravani",51894876,l1);
//	Employee1 obj1=new Employee1("Harshini",51894875,p1);
//	obj1.display();
	obj.display();


	}

}
