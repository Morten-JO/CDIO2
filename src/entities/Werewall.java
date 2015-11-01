package entities;

import logic.Game;

public class Werewall extends Field {

	public Werewall(String name, int points) {
		super(name, points);
	}
	
	@Override
	public void landOn(Player player, Game game){
		player.adjustPoints(getPoints());
		game.rollPlayer(player);
	}
	
	@Override
	public String toString(){
		return "You landed on "+this.getName()+" and lost "+(-this.getPoints())+", but gained an extra turn!";
	}

}
