package patikaDev;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		// boy bilgisi girin
		// kilo bilgisi girin
		// Vücut kitle indeksi: BKI = (kilo)/(boy*boy)
		
		Scanner scan = new Scanner(System.in);
		double m, kg, BKI;
		System.out.print("Boy bilgisi giriniz: ");
		m = scan.nextDouble();
		System.out.print("Kilo bilgisi giriniz: ");
		kg = scan.nextDouble();
		BKI = kg/(m*m);
		System.out.println("Vücut kitle indeksi: " + BKI);
		

	}

}
