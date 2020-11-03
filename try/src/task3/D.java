package task3;

public class D extends C{
void display() {
	System.out.println("hi");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
D obj1=new D();
obj=obj1;
obj.display();


	C obj2=new C();
	D obj4=(D)obj2;
	obj4.display();
	}
}
