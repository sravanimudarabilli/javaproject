package task3;
abstract class Account{
	long accNum;
	double balance;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double d) {
		balance=balance+d;
	}
	public abstract void withdraw(double d);
	void balanceEnquiry() {
		System.out.println("your current account balance:"+balance);
	}
}
public class Person {
	Account acc_holder;
	private String name;
	private int age;
	public Account getAcc_holder() {
		return acc_holder;
	}
	public void setAcc_holder(Account acc_holder) {
		this.acc_holder = acc_holder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
