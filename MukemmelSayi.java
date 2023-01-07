package donguler;

import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		// Kendisi hariç pozitif tamsayı bölenlerinin toplamı kendisine eşit olan sayıdır
		// örnek 28 = 14 + 7 + 4 + 2 + 1
		Scanner input = new Scanner(System.in);
		int toplam = 0;
		System.out.print("Bir sayı giriniz: ");
		int sayi = input.nextInt();
		for(int i=1; i<sayi; i++) {
			if(sayi%i==0) {
				toplam += i;
			}
		}
		if(toplam==sayi) {
			System.out.println(sayi+" mükemmel sayıdır.");
		}
		else {
			System.out.println(sayi+" mükemmel sayı değildir");
		}

	}

}
