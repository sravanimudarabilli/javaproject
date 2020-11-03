package task3;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[5][5];
		Scanner s=new Scanner(System.in);
for(int i=0;i<2;i++) {
	for(int j=0;j<2;j++) {
		a[i][j]=s.nextInt();
	}
	
}
for(int i=0;i<2;i++) {
	for(int j=0;j<2;j++) {
		System.out.println(a[i][j]);	
	}
}
//System.out.println(a);
	}

}
