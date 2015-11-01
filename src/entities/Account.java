package entities;

public class Account {

	private int balance;
	
	public Account(int balance){
		this.balance = balance;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public void adjustBalance(int dif){
		balance += dif;
	}
	
	public int getBalance(){
		return balance;
	}
	
}
