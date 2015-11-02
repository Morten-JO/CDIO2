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
	
	//Returns string based on field
	public String toString(){
		if(name.contains("The Werewall")){
			return "You landed on "+this.getName()+" and lost "+(-this.getPoints())+" points, but gained an extra turn!";
		}
		if(points > 0){
			return "You landed on "+name+" and gain "+points+" points";
		}
		else if(points < 0){
			return "You landed on "+name+" and lose "+(-points)+" points";
		}
		else{
			return "You landed on "+name+" and nothing happens";
		}
		
	}
	
	public void landOn(Player player, Game game){
		player.adjustPoints(points);
	}
	
}
