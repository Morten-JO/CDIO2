package logic;

import java.util.ArrayList;

import entities.Cup;
import entities.Field;
import entities.Player;
import entities.Werewall;

public class Game {

	private Cup cup;
	private ArrayList<Player> players = new ArrayList<Player>();
	private Field[] fields = new Field[11];
	private boolean won;
	private int turn = 1;
	
	public Game(int dices, int diceSides){
		cup = new Cup(dices, diceSides);
		players.add(new Player());
		players.add(new Player());
		initializeArray();
	}
	
	public Game(int dices, int diceSides, String playerOne, String playerTwo){
		cup = new Cup(dices, diceSides);
		players.add(new Player());
		players.get(0).setName(playerOne);
		players.add(new Player());
		players.get(1).setName(playerTwo);
		initializeArray();
	}
	
	private void initializeArray(){
		fields[0] = new Field("Tower", 250);
		fields[1] = new Field("Crater", -100);
		fields[2] = new Field("Palace gates", 100);
		fields[3] = new Field("Cold Desert", -20);
		fields[4] = new Field("Walled city", 180);
		fields[5] = new Field("Monastery", 0);
		fields[6] = new Field("Black cave", -70);
		fields[7] = new Field("Huts in the mountain", 60);
		fields[8] = new Werewall();
		fields[9] = new Field("The pit", -50);
		fields[10] = new Field("Goldmine", 650);
	}
	
	public String rollPlayer(Player player){
		cup.rollDices();
		if(cup.getDiceSum() != 10){
			if(turn == 1){
				turn = 2;
			}
			else{
				turn = 1;
			}
		}
		fields[cup.getDiceSum()-2].landOn(player, this);
		return fields[cup.getDiceSum()-2].toString();
	}
	
	public String checkWinningConditions(){
		if(players.get(0).getBalance() >= 3000 || players.get(1).getBalance() >= 3000){
			if(players.get(0).getBalance() > players.get(1).getBalance()){
				won = true;
				return players.get(0).getName()+" has won the game!";
			}
			else if(players.get(0).getBalance() < players.get(1).getBalance()){
				won = true;
				return players.get(1).getName()+" has won the game!";
			}
			else{
				won = true;
				return "Both players achieved the same amount of points, and the game is tied!";
			}
		}
		else{
			return "";
		}
	}
	
	public boolean getIfWon(){
		return won;
	}
	
	public Player getPlayer(int i){
		return players.get(i);
	}
	
	public Cup getCup(){
		return cup;
	}
	
	public int getTurn(){
		return turn;
	}
	
}
