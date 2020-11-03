package task3;
import java.util.*;
public class Dummy {
String str;
void method() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a value:");
	str=s.nextLine();
	//String[] newstr=new char[str.length()];
	//cha[] c=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		if(i%2!=0) {
			str=str.substring(0,i-1)+"#"+str.substring(i,str.length());
		}
	}
	System.out.println(str);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dummy a=new Dummy();
a.method();
	}

}
