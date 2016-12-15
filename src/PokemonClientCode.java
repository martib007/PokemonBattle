import java.util.*;
public class PokemonClientCode {
	public static void main(String[] args){
		 // Pokemon Selection Screen
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to our Pokemon Battle System!");
		System.out.println("This will be a user vs. user experience! Pick your Pokemon and Start Battling");
		System.out.println("Aviable Pokemon Choices: Turtwig, Cyndaquil, and Mudkip");//add more pokemon later
		System.out.println("Player 1 choose first!");
		
		//Player 1 chooses Pokemon
		while(true) {
			String pokemon1 = userInput.next();
			if (pokemon1.toLowerCase().equals("turtwig")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				break;
			}
			else if (pokemon1.toLowerCase().equals("cyndaquil")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				break;
			}
			else if (pokemon1.toLowerCase().equals("mudkip")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				break;
			}
			else{
			System.out.println("You did not enter a valid pokemon, please try again.");
			}
		}
		
		System.out.println("Player 2 choose next!");
		
		//Player 2 chooses Pokemon
		while(true) {
			String pokemon2 = userInput.next();
			if (pokemon2.toLowerCase().equals("turtwig")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				break;
			}
			else if (pokemon2.toLowerCase().equals("cyndaquil")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				break;
			}
			else if (pokemon2.toLowerCase().equals("mudkip")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				break;
			}
			else{
			System.out.println("You did not enter a valid pokemon, please try again.");
			}
		}
	}
}
