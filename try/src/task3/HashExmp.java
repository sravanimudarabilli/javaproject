package task3;
import java.util.*;
import java.util.HashMap;

public class HashExmp {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		HashMap<String,Integer> obj=new HashMap<String,Integer>();
		HashMap<String,Integer> obj1=new HashMap<String,Integer>();
		obj.put("one",1);
		obj.put("two", 2);
		obj.put("three", 3);
		obj.put("four",4);
		obj1.putAll(obj);
		if(obj.containsValue(1)) {
			System.out.println("contains value");
		}else {
			System.out.println("not having the value");
		}
		Iterator<String> itr=obj.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator<Integer> itr1=obj.values().iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Iterator<Map.Entry<String,Integer>> itr2=obj.entrySet().iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		Iterator<Integer> itr4=obj1.values().iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
	}

}
