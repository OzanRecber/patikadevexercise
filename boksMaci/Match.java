package boksMaci;

public class Match {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
		
	}
	void run() { // müsabaka başlama durumu
		if(isCheck()) {
			int count = 1;
			while(this.f1.health > 0 && this.f2.health > 0) {
				System.out.println("*****" + count + ". ROUND" + "*****");
				count++;
				if(isRun()) {
					this.f2.health = this.f1.hit(f2);
					if(isWin()) {
						break;
					}
				} else {
					this.f1.health = this.f2.hit(f1);
					if(isWin()) {
						break;
					}
				}
				System.out.println(this.f1.name + " sağlık: " + this.f1.health);
				System.out.println(this.f2.name + " sağlık: " + this.f2.health);
			}
		} else {
			System.out.println("Sporcuların sikletleri uymuyor!");
		}
	}
	boolean isCheck() { // Siklet kontrolü
		return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
	}
	boolean isWin() { // kazananı belirleyen metot
		if(this.f1.health == 0) {
			System.out.println("Kazanan: " + this.f2.name + "!");
			return true;
		} if(this.f2.health == 0) {
			System.out.println("Kazanan: " + this.f1.name + "!");
			return true;
		}
		return false;
	}
	boolean isRun() {
		double randomNumber = Math.random()*100;
		return randomNumber < 50 ? true : false;
	}
	
}
