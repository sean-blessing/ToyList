package toylist.db;

import toylist.business.Toy;

public class ToyArray implements ToyDAO {
	
	Toy[] toys;
	
	public ToyArray() {
		populateToys();
	}

	/**
	 * Populate the <code>toys</code> variable with a hardcoded
	 * list of toys.
	 */
	private void populateToys() {
		toys = new Toy[4];
		toys[0] = new Toy("lego1", ToyType.BUILDING_SETS, "Batman Batmobile Legos", 24.99);
		toys[1] = new Toy("pvz1", ToyType.VIDEO_GAMES, "Plants vs Zombies PS4 Game", 19.99);
		toys[2] = new Toy("tdyb", ToyType.STUFFED_ANIMALS, "Teddy Bear", 9.99);
		toys[3] = new Toy("pkch", ToyType.POKEMON, "Pikachu", 5.0);
		
	}

	@Override
	public String listToys() {
		String str = "";
		for (Toy t:toys) {
			str+=t.toString()+"\n";
		}
		return str;
	}

	@Override
	public String getToy(String code) {
		String str = "";
		for (Toy t:toys) {
			if (t.getCode().equalsIgnoreCase(code)) {
				str+=t.toString();
			}
		}
		return str;
	}

	@Override
	public boolean addToy(Toy toy) {
		System.err.println("addToy method not yet implemented!");
		return false;
	}

}
