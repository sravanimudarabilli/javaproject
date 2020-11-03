package task3;

import java.util.function.Function;

public class Sexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,String> obj=(str)->str.replace(""," ");
System.out.println(obj.apply("HCL"));
	}

}
