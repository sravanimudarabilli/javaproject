package task3;

import java.util.Random;

public class SavingsAccount extends Account {
	final double minbalance=3500;
	public void withdraw(double d) {
		if(balance>minbalance) {
			balance=balance-d;
			System.out.println("your current balance:"+balance);
		}else {
			System.out.println("your Account balance is insufficient");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj=new SavingsAccount();
		Account b=new SavingsAccount();
		Person p=new Person();
		Person q=new Person();
		Random r=new Random();
		obj.setAccNum((long)(r.nextInt(999999)+9999999));
		obj.setBalance(2000);
		p.setName("smith");
		p.setAge(20);
		p.setAcc_holder(obj);
		b.setAccNum((long)(r.nextInt(999999)+9999999));
		b.setBalance(3000);
		q.setName("Kathy");
		q.setAge(21);
		q.setAcc_holder(b);
		obj.deposit(2000);
		obj.balanceEnquiry();
		b.withdraw(2000);
	}
}


