package entities;

public class Werewall extends Field {

	public Werewall() {
		super("The Werewall (werewolf-wall)", -80);
	}
	
	@Override
	public String toString(){
		return "You landed on "+this.getName()+" and lost "+(-this.getPoints())+" points, but gained an extra turn!";
	}
}