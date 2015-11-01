package run;

import logic.Game;
import desktop_fields.Empty;
import desktop_fields.Field;
import desktop_resources.GUI;

public class GUIMain {

	public static void main(String[] args) {
		Field[] list = new Field[1];
		list[0] = new Empty.Builder().build();
		GUI.create(list);
		String playerOneName = GUI.getUserString("Write Player One Name");
		String playerTwoName = GUI.getUserString("Write Player Two Name");
		Game game = new Game(2, 6, playerOneName, playerTwoName);
		GUI.addPlayer(game.getPlayer(0).getName(), game.getPlayer(0).getBalance());
		GUI.addPlayer(game.getPlayer(1).getName(), game.getPlayer(1).getBalance());
		while(true){
			System.out.println(game.getTurn());
			while(game.getTurn() == 1){
				rollPlayer(1, game);
			}
			System.out.println(game.getTurn());
			while(game.getTurn() == 2){
				rollPlayer(2, game);
			}
			String message = game.checkWinningConditions();
			if(game.getIfWon()){
				GUI.showMessage(message);
				break;
			}
		}
		GUI.getUserButtonPressed("", "Exit");
		GUI.close();
	}
	
	public static void rollPlayer(int player, Game game){
		GUI.getUserButtonPressed(game.getPlayer(player-1).getName()+"s turn to roll!", "Roll");
		String desc = game.rollPlayer(game.getPlayer(player-1));
		System.out.println(desc);
		GUI.setDice(game.getCup().getSumOfDice(0), game.getCup().getSumOfDice(1));
		GUI.getUserButtonPressed(desc, "Ok");
		GUI.setBalance(game.getPlayer(player-1).getName(), game.getPlayer(player-1).getBalance());
		
	}
}
