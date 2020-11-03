package task3;
import java.util.*;
public class Person1 {
	String name;
	int age;
	String proff;
	public Person1(String name,int age,String proff){
		this.name=name;
		this.age=age;
		this.proff=proff;
	}
	public String toString() {
		return name+" "+age+" "+proff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 obj=new Person1("sravani",21,"engineer");
		Person1 obj2=new Person1("harshini",22,"doctor");
		ArrayList<Person1> people=new ArrayList<Person1>();
		people.add(obj);
		people.add(obj2);
		Iterator<Person1> itr=people.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
	}

}
