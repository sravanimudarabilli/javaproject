package task3;

import java.util.function.BiFunction;

public class BiExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer,Integer,Double> power=(x,y)->Math.pow(x,y);
System.out.println("power:"+power.apply(2, 5));

	}

}
