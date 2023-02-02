package boksMaci;

public class main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Ivan Draga", 10, 120, 110, 50);
		Fighter f2 = new Fighter("Rocky", 15, 85, 90, 50);
		
		Match match = new Match(f1, f2, 90, 110);
		match.run();
	}

}
