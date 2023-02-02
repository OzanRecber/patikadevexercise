package boksMaci;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	int dodge; // gelen darbeyi engelleme
	
	Fighter(String name, int damage, int health, int weight, int dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if(dodge <= 100 && dodge >=0) {
			this.dodge = dodge;
		} else {
			this.dodge = 0;
		}
	}
	
	int hit(Fighter foe) { // Vurma metodu, foe=rakip
		System.out.println(this.name + ", " + foe.name + "'ye " + this.damage + " hasar vurdu.");
		if(foe.isDodge()) {
			System.out.println(foe.name + " gelen atağı engelledi!");
			System.out.println("-------------");
			return foe.health;
		} else {
			System.out.println(foe.name + " gelen atağı engelleyemedi!");
			System.out.println("-------------");
		}
		if(foe.health - this.damage <= 0) {
			return 0;
		}
		return foe.health - this.damage;
	}
	boolean isDodge() {
		double randomValue = Math.random()*100;
		return randomValue <= this.dodge;
	}
}
