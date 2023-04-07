package patikaDev;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		Random rand = new Random();
		int sayi = rand.nextInt(100) + 1;
		int hak = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı tahmini oyununa hoşgeldiniz!\n"
				+ "1 ile 100 arasında bir sayı girmeniz gerekiyor. 5 hakkınız var!");
		int tahmin;
		while (hak < 6) {
			System.out.print("Tahmin ettiğiniz sayıyı giriniz: ");
			tahmin = scan.nextInt();
			if (tahmin < 1 || tahmin > 100) {
				System.out.println("Hatalı bir sayı girdiniz! Lütfen 1 ile 100 arası bir sayı giriniz.");
				continue;

			} else if (tahmin < sayi && hak < 5) {
				System.out.println("Bilemediniz! Lütfen daha büyük bir sayı giriniz.\n"
						+ "Kalan hakkınız: " + (5 - hak));
				hak++;

			} else if (tahmin > sayi && hak < 5) {
				System.out.println("Bilemediniz! Lütfen daha küçük bir sayı giriniz.\n"
						+ "Kalan hakkınız: " + (5 - hak));
				hak++;

			} else if (tahmin == sayi) {
				System.out.println("Tebrikler seçilen sayıyı bildiniz!\n" + hak + ". hakkınızda doğru tahmini buldunuz.");
				break;

			} else {
				System.out.println("Maalesef tahmin hakkınız kalmamıştır!");
				break;
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Seçilen sayı: " + sayi);

	}

}
