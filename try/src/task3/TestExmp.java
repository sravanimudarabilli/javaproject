package task3;
import java.util.*;
public class TestExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp e1=new Emp(49,"srav");
Emp e3=new Emp(25,"hari");
Emp e2=new Emp(25,"hari");
HashSet<Emp> obj=new HashSet<Emp>();
obj.add(e1);
obj.add(e2);
obj.add(e3);
System.out.println(obj.size());
System.out.println(obj);
	}

}
