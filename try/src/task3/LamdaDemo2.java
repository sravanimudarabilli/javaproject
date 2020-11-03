package task3;

@FunctionalInterface
interface I1{
	void message();
}

@FunctionalInterface
interface I2{
	void add(int i);
}

@FunctionalInterface
interface I3{
	void adding(int a,int b);
}

@FunctionalInterface
interface I4{
	void len(String str);
} 
@FunctionalInterface
interface I5{
	void greatest(int p,int q);
}
//main class
public class LamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 obj=()->
		System.out.println("hello world");
		I2 obj1=(int i)->
		System.out.println(i+10);
		I3 obj3=(int a,int b)->
		System.out.println(a+b);
		I4 obj4=(String str)->
		System.out.println(str.length());
		I5 obj5=(int p,int q)->{
			int result=p>q?p:q;
			System.out.println("greatest:"+result);
		};
		obj.message();
		obj1.add(5);
		obj3.adding(7, 9);
		obj4.len("harshini");
		obj5.greatest(7, 9);
	}

}
