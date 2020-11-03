package task3;
import java.util.*;
public class Emp {
 int id;
String name;
public Emp(int id,String name) {
	this.name=name;
	this.id=id;
	}
public int hashCode() {
	return 12;
}
public boolean equals(Object ob) {
	boolean flag=false;
	Emp e=(Emp)ob;
	if((this.name==e.name)&&(this.id==e.id)) {
		flag=true;
	}
	return flag;
}


}
