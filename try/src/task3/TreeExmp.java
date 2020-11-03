package task3;
import java.util.*;
public class TreeExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> obj=new TreeMap<String,String>();
obj.put(null, "srav");
obj.put("hari", null);
obj.put("vari", null);
Iterator<Map.Entry<String,String>> itr=obj.entrySet().iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

}

}
