package task3;

import java.util.function.Predicate;
import java.util.*;
public class PredExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter username");
		String s1=s.next();
		System.out.println("enter password");
		String str=s.next();
Predicate<String> obj=(user)->user.equals("srav");
System.out.println(obj.test(s1));
Predicate<String> obj1=(pass)->pass.equals("s");
System.out.println(obj1.test(str));
	}

}
