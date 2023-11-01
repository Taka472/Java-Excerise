package bai8;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double Rate = 0.035;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
		setAccountNumber(999999);
		setName("Undefined");
		setBalance(50000);
	}
	
	public Account(long AccountNumber, String name, double balance){
		if (AccountNumber < 0) setAccountNumber(999999);
		else setAccountNumber(AccountNumber);
		
		if (name.equals("")) setName("Undefined");
		else setName(name);
		
		if (balance < 50000) setBalance(50000);
		else setBalance(balance);
	}
	
	public Account(long AccountNumber, String name) {
		if (AccountNumber < 0) setAccountNumber(999999);
		else setAccountNumber(AccountNumber);
		
		if (name.equals("")) setName("Undefined");
		else setName(name);
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) return false;
		setBalance(getBalance() + amount);
		return true;
	}
	
	public boolean withdraw(double amount, double fee) {
		if (amount <= 0 || amount + fee > getBalance()) return false;
		setBalance(getBalance() - amount - fee);
		return true;
	}
	
	public void addInterest() {
		setBalance(getBalance() * (1 + Rate));
	}
	
	public boolean transfer(Account acc2, double amount) {
		if (withdraw(amount,0) && acc2.deposit(amount)) return true;
		return false;
	}
	
	public String toString() {
		Locale local = new Locale("vi", "vn");
		NumberFormat fmt = NumberFormat.getCurrencyInstance(local);
		return "So tai khoan: " + getAccountNumber() + "\nNguoi so huu: " + this.name + "\nSo du: " + fmt.format(getBalance());
	}
}
