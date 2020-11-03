package task3;
import java.io.*;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string");
		String s=br.readLine();
		System.out.println("enter no");
		int n=Integer.parseInt(br.readLine());
		System.out.println("enter no");
		int n1=Integer.parseInt(br.readLine());
		System.out.println(s+n+n1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}

}
