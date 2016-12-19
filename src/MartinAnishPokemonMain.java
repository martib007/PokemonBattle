import java.util.*;
public class MartinAnishPokemonMain {
	public static void main(String[] args){
		//defining of variables
		int roundsPlayed = 0;
		String choice1;
		String choice2;
		String pokemon1;
		String pokemon2;
		MartinAnishPokemon p1;
		MartinAnishPokemon p2;
		
		 // Pokemon Selection Screen
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to our Pokemon Battle System!");
		System.out.println("This will be a user vs. user experience! Pick the Pokemon you wish and start battling.");
		System.out.println("Aviable Pokemon Choices: Lucario, Mewtwo, Mudkip, and Zigzagoon.");//add more pokemon later
		System.out.println("Player 1 choose first!");
		
		//Player 1 chooses Pokemon
		while(true) {
			pokemon1 = userInput.next();
			pokemon1 = pokemon1.toLowerCase();
			if (pokemon1.equals("lucario")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				p1 = new MartinAnishPokemon("lucario");//declares pokemon to be lucario
				break;
			}
			else if (pokemon1.equals("mudkip")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				p1 = new MartinAnishPokemon("mudkip");//declares pokemon to be mudkip
				break;
			}
			else if (pokemon1.equals("mewtwo")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				p1 = new MartinAnishPokemon("mewtwo");//declares pokemon to be mewtwo
				break;
			}
			else if (pokemon1.equals("zigzagoon")){
				System.out.println("Player 1 chose " + pokemon1 + ".");
				p1 = new MartinAnishPokemon("zigzagoon");//declares pokemon to be zigzagoon
				break;
			}
			else{
			System.out.println("You did not enter a valid pokemon name, please try again.");
			}
		}
		
		System.out.println("Player 2 choose next!");
		
		//Player 2 chooses Pokemon
		while(true) {
			pokemon2 = userInput.next();
			pokemon2 = pokemon2.toLowerCase();
			if (pokemon2.equals("lucario")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				p2 = new MartinAnishPokemon("lucario");//declares pokemon to be lucario
				break;
			}
			else if (pokemon2.equals("mudkip")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				p2 = new MartinAnishPokemon("mudkip");//declares pokemon to be mudkip
				break;
			}
			else if (pokemon2.equals("mewtwo")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				p2 = new MartinAnishPokemon("mewtwo");//declares pokemon to be mewtwo
				break;
			}
			else if (pokemon2.equals("zigzagoon")){
				System.out.println("Player 2 chose " + pokemon2 + ".");
				p2 = new MartinAnishPokemon("zigzagoon");//declares pokemon to be zigzagoon
				break;
			}
			else{
			System.out.println("You did not enter a valid pokemon name, please try again.");
			}

		}
		
		//info for battle start
		System.out.println("Get ready to battle!");
		System.out.println("While in battle, you can either \"attack\" or \"defend\". Attacks will always be 60 damage,");
		System.out.println(" defending will block damage based on how big the defense stat of your pokemon is.");
		System.out.println("Battle will start in:");
		System.out.println("3, 2, 1");
		System.out.println("Go!");
		
		//battle starts, does not end until one pokemon is defeated
		while (p1.hp >= 0 && p2.hp >= 0){
			roundsPlayed++; //count the amount of rounds that the battle goes on for
			
			//player 1 chooses what to do
			System.out.println("What will Player 1 do?");
			while (true){
				choice1 = userInput.next();
				choice1 = choice1.toLowerCase();
			
				if (choice1.equals("attack")){
					System.out.println("Player 1 decided to attack.");
					break;
				}
				else if (choice1.equals("defend")){
					System.out.println("Player 1 decided to defend.");
					break;
				}
				else{
					System.out.println("You did not enter a valid battle command, please try again.");
				}
			}
			
			
			//player 2 chooses what to do
			System.out.println("What will Player 2 do?");
			while (true){
				choice2 = userInput.next();
				choice2 = choice2.toLowerCase();
			
				if (choice2.equals("attack")){
					System.out.println("Player 2 decided to attack.");
					break;
				}
				else if (choice2.equals("defend")){
					System.out.println("Player 2 decided to defend.");
					break;
				}
				else{
					System.out.println("You did not enter a valid battle command, please try again.");
				}
			}
			
			//actions based on choices made
			if (choice1.equals("attack") && choice2.equals("attack")){ //both players choose to attack
				System.out.println(pokemon1 + " and " + pokemon2 + " attack each other.");
				p1.hp = p1.hp - 60;
				p2.hp = p2.hp - 60;
				if (p1.hp <= 0){
					System.out.println(pokemon1 + " now has 0 hp.");
				}
				else{
					System.out.println(pokemon1 + " now has " + p1.hp + " hp.");
				}
				if (p2.hp <= 0){
					System.out.println(pokemon2 + " now has 0 hp.");
				}
				else{
					System.out.println(pokemon2 + " now has " + p2.hp + " hp.");
				}
			}
			else if (choice1.equals("defend") && choice2.equals("attack")){ //player 1 defends, player 2 attacks
				System.out.println(pokemon2 + " attacks " + pokemon1 + ", but " + pokemon1 + " defends.");
				int temp = p1.def - 60; //removes (defense stat) from attack given
				if (temp > 0){ //cannot gain health from defending
					temp = 0;
				}
				p1.hp = p1.hp + temp;
				if (p1.hp <= 0){
					System.out.println(pokemon1 + " now has 0 hp.");
				}
				else{
					System.out.println(pokemon1 + " now has " + p1.hp + " hp.");
				}
				if (p2.hp <= 0){
					System.out.println(pokemon2 + " now has 0 hp.");
				}
				else{
					System.out.println(pokemon2 + " now has " + p2.hp + " hp.");
				}
			}
			else if (choice1.equals("attack") && choice2.equals("defend")){ //player 1 attacks, player 2 defends
				System.out.println(pokemon1 + " attacks " + pokemon2 + ", but " + pokemon2 + " defends.");
				int temp = p2.def - 60; //removes (defense stat) from attack given
				if (temp > 0){ //cannot gain health from defending
					temp = 0;
				}
				p2.hp = p2.hp + temp;
				if (p1.hp <= 0){
					System.out.println(pokemon1 + " now has 0 hp.");
				}
				else{
					System.out.println(pokemon1 + " now has " + p1.hp + " hp.");
				}
				if (p2.hp <= 0){
					System.out.println(pokemon2 + " now has 0 hp.");
				}
				else{
					System.out.println(pokemon2 + " now has " + p2.hp + " hp.");
				}
			}
			else if (choice1.equals("defend") && choice2.equals("defend")){ //both players defend
				System.out.println("Both pokemone defend against each other, nothing happens...");
				if (p1.hp <= 0){
					System.out.println(pokemon1 + " has 0 hp.");
				}
				else{
					System.out.println(pokemon1 + " has " + p1.hp + " hp.");
				}
				if (p2.hp <= 0){
					System.out.println(pokemon2 + " has 0 hp.");
				}
				else{
					System.out.println(pokemon2 + " has " + p2.hp + " hp.");
				}
			}
		}
		
		//final decision of who wins
		if (p1.hp > p2.hp){
			System.out.println(pokemon2 + " has feinted, Player 1 is the victor with their " + pokemon1 + ".");
			System.out.println("Player 1 won in " + roundsPlayed + " rounds.");
		}
		else{
			System.out.println(pokemon1 + " has feinted, Player 2 is the victor with their " + pokemon2 + ".");
			System.out.println("Player 2 won in " + roundsPlayed + " rounds.");
		}
	}
}