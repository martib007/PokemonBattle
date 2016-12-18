import java.util.*;
public class PokemonClientCode {
	public static void main(String[] args){
		 // Pokemon Selection Screen
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to our Pokemon Battle System!");
		System.out.println("This will be a user vs. user experience! Pick your Pokemon and Start Battling.");
		System.out.println("Aviable Pokemon Choices: Lucario, Mudkip, Mewtwo, and Zigzagoon.");//add more pokemon later
		System.out.println("Player 1 choose first!");
		
		//Player 1 chooses Pokemon
		while(true) {
			String pokemon1 = userInput.next();
			pokemon1 = pokemon1.toLowerCase();
			if (pokemon1.equals("lucario")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				Pokemon p1 = new Pokemon("lucario");//declares pokemone to be lucario
				break;
			}
			else if (pokemon1.equals("mudkip")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				Pokemon p1 = new Pokemon("mudkip");//declares pokemone to be mudkip
				break;
			}
			else if (pokemon1.equals("mewtwo")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				Pokemon p1 = new Pokemon("mewtwo");//declares pokemone to be mewtwo
				break;
			}
			else if (pokemon1.equals("zigzagoon")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				Pokemon p1 = new Pokemon("zigzagoon");//declares pokemone to be zigzagoon
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
			pokemon2 = pokemon2.toLowerCase();
			if (pokemon2.equals("lucario")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				Pokemon p2 = new Pokemon("lucario");//declares pokemone to be lucario
				break;
			}
			else if (pokemon2.equals("mudkip")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				Pokemon p2 = new Pokemon("mudkip");//declares pokemone to be mudkip
				break;
			}
			else if (pokemon2.equals("mewtwo")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				Pokemon p2 = new Pokemon("mewtwo");//declares pokemone to be mewtwo
				break;
			}
			else if (pokemon2.equals("zigzagoon")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				Pokemon p2 = new Pokemon("zigzagoon");//declares pokemone to be zigzagoon
				break;
			}
			else{
			System.out.println("You did not enter a valid pokemon, please try again.");
			}

		}
		
		System.out.println("Get ready to battle!");
	}
}
