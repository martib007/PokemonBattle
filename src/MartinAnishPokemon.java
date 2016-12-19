public class MartinAnishPokemon {
	String pokemonChosen;
	int hp;
	int def;
	
	public MartinAnishPokemon(String pokemonChosen) {
		this.pokemonChosen = pokemonChosen;
		
		if (this.pokemonChosen.equals("lucario")){ //checks if the pokemon chosen by the player is Lucario
			this.hp = 70;
			this.def = 70;
		}
		else if (this.pokemonChosen.equals("mudkip")){ //checks if the pokemon chosen by the player is Mudkip
			this.hp = 50;
			this.def = 50;
		}
		else if (this.pokemonChosen.equals("mewtwo")){ //checks if the pokemon chosen by the player is Mewtwo
			this.hp = 106;
			this.def = 90;
		}
		else if (this.pokemonChosen.equals("zigzagoon")){ //checks if the pokemon chosen by the player is Zigzagoon
			this.hp = 38;
			this.def = 41;
		}
	}
}
