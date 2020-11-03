package task3;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main obj=new Main();
obj=null;
System.gc();


	}
	protected void finalize() {
		System.out.println("hello");
	}

}
