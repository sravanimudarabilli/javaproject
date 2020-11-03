package task3;
import java.util.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter some string:");
		String s1=s.nextLine();
		String[] words=s1.split("\s");
		String newString="";
		for(String w:words) {
			String first=w.substring(0,1);
			String rest=w.substring(1);
			newString=newString+first.toUpperCase()+rest+" ";
		}
		System.out.println(newString.trim());
	}

}
