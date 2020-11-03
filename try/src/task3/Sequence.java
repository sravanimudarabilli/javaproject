package task3;
import java.util.*;
public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("enter size of array:");
		n=s.nextInt();
		String s1="123";
		int[] a=new int[n];
		System.out.println("enter values");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		String str=a.toString();
		System.out.println("check whether given array has 123 sequence");
		System.out.println(str.contains(s1));
	}

}
