package entities;

public class Account {

	private int balance;
	
	public Account(int balance){
		setBalance(balance);
	}
	
	public void setBalance(int balance){
		if(balance < 0){
			balance = 0;
			return;
		}
		this.balance = balance;
	}
	
	public void adjustBalance(int dif){
		balance += dif;
		if(balance < 0){
			balance = 0;
		}
	}
	
	public int getBalance(){
		return balance;
	}
	
}
