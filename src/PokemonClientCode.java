import java.util.*;
public class PokemonClientCode {
	public static void main(String[] args){
		 // Pokemon Selection Screen
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to our Pokemon Battle System!");
		System.out.println("This will be a user vs. user experience! Pick your Pokemon and Start Battling");
		System.out.println("Aviable Pokemon: Turtwig, Cyndaquil, Mudkip");//add more pokemon later
		
		String pokemon = userInput.next();
		System.out.println("You chose " + pokemon);
	}
}
