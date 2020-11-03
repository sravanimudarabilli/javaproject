package task3;
import java.util.*;
class Summing implements Runnable{
	int a;
	public Summing(int a) {
		this.a=a;
	}
	public void run() {

		add();

	}
	public void add() {
		Random r=new Random();
		int n=r.nextInt(10)+1;
		System.out.println("number generated:"+n);

		a=a+n;

	}
}
public class ThreadExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Summing obj=new Summing(sum);
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		Thread t4=new Thread(obj);
		Thread t5=new Thread(obj);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("final sum:"+obj.a);
	}

}
