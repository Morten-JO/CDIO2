package entities;

public class Player {

	private String name = "";
	private Account account;
	
	public Player(){
		account = new Account(1000);
	}
	
	public void adjustPoints(int dif){
		account.adjustBalance(dif);
	}
	
	public void setBalance(int balance){
		account.setBalance(balance);
	}
	
	public int getBalance(){
		return account.getBalance();
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
