package task3;
import java.util.*;

public class Operations {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		TreeSet<String> s1=new TreeSet<String>();
		TreeSet<String> s2=new TreeSet<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("enter values for set-1:");
		for(int i=0;i<3;i++) {
			s1.add(s.next());
		}
	
		System.out.println("enter values for set-2:");
		for(int i=0;i<3;i++) {
			s2.add(s.next());
		}
		System.out.println("elements of set-1:"+s1);
		System.out.println("elements of set-2:"+s2);
		//union
		TreeSet<String> temp=new TreeSet<String>(s1);
		temp.addAll(s2);
		System.out.println("union of s1 and s2:"+temp);
		//intersection
		TreeSet<String> temp1=new TreeSet<String>(s1);
		/*for(String i:s2) {
			if(s1.contains(i));
			{
				temp1.add(i);
			}
		}*/
		temp1.retainAll(s2);
		System.out.println("intersection of s1 and s2:"+temp1);
		//difference
		TreeSet<String> temp2=new TreeSet<String>(s1);
		temp2.removeAll(s2);
		System.out.println("difference of s1 and s2:"+temp2);

	}

}
