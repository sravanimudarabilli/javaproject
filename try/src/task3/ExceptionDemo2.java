package task3;
import java.util.*;

	class MyNegativeAgeException extends Exception{
		public String toString() {
			//System.out.println("have error");
			return "Age cannot be negative";
		}
	}
	public class ExceptionDemo2 {
	public static void main(String[] args) throws MyNegativeAgeException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=s.nextInt();
		//try {
			if(age<0) {
				throw new MyNegativeAgeException();
			}
			else {
				System.out.println("Age is:"+age);
			}
		/*}catch( MyNegativeAgeException e) {
			System.out.println(e);
		}*/

	}

}
