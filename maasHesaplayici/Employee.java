package maasHesaplayici;

public class Employee {
	String name;
	double salary; //maaş
	int workHours; //çalışma saati
	int hireYear; //işe başladığı yıl
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	double tax() {
		double tax = 0;
		if(salary > 1000) {
			tax = salary * 0.03;
		}
		return tax;
	}	
	int bonus() {
		int bonus = 0;
		if(workHours > 40) {
			bonus = (workHours-40)*30;
		}
		return bonus;
	}
	double raiseSalary() { //çalışanın işe başlangıç yılına göre maaş artış oranı hesaplanacak
		double raise = 0; //artış miktarı
		int yearsOfService = 2021 - hireYear; //yearsOfService = hizmet yılı
		if(yearsOfService < 10) {
			raise = salary * 0.05;
		} else if(yearsOfService >= 10 && yearsOfService < 20) {
			raise = salary * 0.1;
		} else if(yearsOfService >= 20) {
			raise = salary * 0.15;
		}
		return raise;
	}
	public String toString() {
		return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours + "\nBaşlangıç Yılı: " + this.hireYear
				+ "\nVergi: " + this.tax() + "\nBonus: " + this.bonus() + "\nMaaş Artışı: " + this.raiseSalary()
				+ "\nVergi ve Bonuslar ile Birlikte Maaş: " + (this.salary - this.tax() + this.bonus())
				+ "\nToplam Maaş: " + (this.salary + this.raiseSalary());
	}
}
