package task3;
import java.util.*;
class MyPasswordException extends Exception{
	public String toString() {
		return "incorrect password";
	}
}
public class ExceptionDemo3 {
	static int count;
	public static void main(String[] args) {
		
		String str;
		String s1="srav";
		// TODO Auto-generated method stub
		do {
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("enter your password:");
			str=s.next();
			System.out.println(count);
			try {
				if(str.equals(s1)){
					System.out.println("welcome");
break;
				}else {
					count++;
					throw new MyPasswordException();
				}
			}catch(MyPasswordException e) {
				System.out.println(e);
			}
		}while(count<3);
		if(count==3) {
		System.out.println("exceeded limit");
		}

	}
}
