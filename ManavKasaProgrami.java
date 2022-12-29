package patikaDev;

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		/* Armut : 2,14 TL
		 * Elma : 3,67 TL
		 * Domates : 1,11 TL
		 * Muz: 0,95 TL
		 * Patlıcan : 5,00 TL
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç kg armut alınmış: ");
		double armutKg = scan.nextDouble();
		double armut = 2.14*armutKg;
		System.out.println("Armut: " + armut);
		System.out.print("Kaç kg elma alınmış: ");
		double elmaKg = scan.nextDouble();
		double elma = 3.67*elmaKg;
		System.out.println("Elma: " + elma);
		System.out.print("Kaç kg domates alınmış: ");
		double domatesKg = scan.nextDouble();
		double domates = 1.11*domatesKg;
		System.out.println("Domates: " + domates);
		System.out.print("Kaç kg muz alınmış: ");
		double muzKg = scan.nextDouble();
		double muz = 0.95*muzKg;
		System.out.println("Muz: " + muz);
		System.out.print("Kaç kg patlıcan alınmış: ");
		double patlicanKg = scan.nextDouble();
		double patlican = 5*patlicanKg;
		System.out.println("Patlican: " + patlican);
		double toplam = armut+elma+domates+muz+patlican;
		System.out.println("Toplam ödenen tutar: " + toplam);
		
		
		
		

	}

}
