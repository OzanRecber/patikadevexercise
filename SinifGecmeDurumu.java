package patikaDev;

import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {
		double mat, fizik, kimya, turkce, muzik;
		Scanner input = new Scanner(System.in);
		System.out.println("Matematik notunu giriniz: ");
		mat = input.nextDouble();
		System.out.println("Fizik notunu giriniz: ");
		fizik = input.nextDouble();
		System.out.println("Kimya notunu giriniz: ");
		kimya = input.nextDouble();
		System.out.println("Türkçe notunu giriniz: ");
		turkce = input.nextDouble();
		System.out.println("Müzik notunu giriniz: ");
		muzik = input.nextDouble();
		double ort = (mat+fizik+kimya+turkce+muzik)/5;
		if(ort<0 || ort>100) {
			System.out.println("Ortalama 0'dan küçük veya 100'den büyük olamaz!");
		}
		else if(ort>=55) {
			System.out.println("Ortalamanız: " + ort + "\nTebrikler sınıfı geçtiniz!");
		}
		else {
			System.out.println("Ortalamanız: " + ort + "\nMaalesef sınıfı geçemediniz!");
		}

	}

}
