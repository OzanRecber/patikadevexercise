package patikaDev;

import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {
		// km başına 2.2 TL
		// min ödeme tutarı 20 TL
		// Açılış ücreti 10 TL
		
		Scanner scan = new Scanner(System.in);
		int km;
		double perKm = 2.20, total = 10; 
		System.out.print("Km bilgisi giriniz: ");
		km = scan.nextInt();
		total += km * perKm;
		total = total < 20 ? 20 : total;
		System.out.println("Toplam tutar: " + total);
		

	}

}
