package donguler;

import java.util.Scanner;

public class Alistirma7 {

	public static void main(String[] args) {
		// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
		// Örnek : 1643 = 1 + 6 + 4 + 3 = 14
		
		 Scanner input = new Scanner(System.in);
		 System.out.print("Lütfen bir sayı girin: ");
	     int sayi = input.nextInt();
	     int toplam = 0;
   	     while (sayi > 0) {
		     toplam += sayi % 10;
		     sayi /= 10;
		    }
		    System.out.println("Basamak sayılarının toplamı: " + toplam);
		
	}

}
