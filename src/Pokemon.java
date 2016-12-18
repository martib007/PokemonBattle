public class Pokemon {
	String pokemonChosen;
	int hp;
	int speed;
	
	public Pokemon(String pokemonChosen) {
		this.pokemonChosen = pokemonChosen;
		if (pokemonChosen.equals("lucario")){ //checks if the pokemon chosen by the player is Lucario
			int hp = 70;
			int speed = 90;
		}
		else if (pokemonChosen.equals("mudkip")){ //checks if the pokemon chosen by the player is Mudkip
			int hp = 50;
			int speed = 40;
		}
		else if (pokemonChosen.equals("mewtwo")){ //checks if the pokemon chosen by the player is Mewtwo
			int hp = 106;
			int speed = 130;
		}
		else if (pokemonChosen.equals("zigzagoon")){ //checks if the pokemon chosen by the player is Zigzagoon
			int hp = 38;
			int speed = 60;
		}
	}
}
