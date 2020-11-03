package task3;
interface Inetrf{
	void accept();
	
}
public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inetrf obj=()->
System.out.println("hi");
obj.accept();
	}

}
