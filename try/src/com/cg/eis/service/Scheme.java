package com.cg.eis.service;
import com.cg.eis.bean.*;
interface I{
	String employeeScheme(int salary);
}
public class Scheme extends Employee4 implements I{
	public String employeeScheme(int salary) {
		String result="";
		if((salary>5000)&& (salary<20000)) {
			result= "C";
		}
		if((salary>=20000)&&(salary<40000)) {
			result= "B";
		}
		if(salary>40000) {
			result= "A";
		}
		if(salary<5000) {
			result ="you are not elgibile";
		}
return result;
	}
}
