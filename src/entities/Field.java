package entities;

import logic.Game;

public class Field {

	private String name = "";
	private int points = 0;
	
	public Field(String name, int points){
		this.name = name;
		this.points = points;
	}
	
	public int getPoints(){
		return points;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		if(points > 0){
			return "You landed on "+name+" and gain "+points;
		}
		else if(points < 0){
			return "You landed on "+name+" and lose "+(-points);
		}
		else{
			return "You landed on "+name+" and nothing happens";
		}
		
	}
	
	public void landOn(Player player, Game game){
		player.adjustPoints(points);
	}
	
}
