package patikaDev;

import java.util.Scanner;

public class KdvTutari {

	public static void main(String[] args) {
		// Kdv'siz fiyat = 10
		// Kdv'li fiyat = 11.8
		// Kdv tutarı = 1.8
		
		Scanner input = new Scanner(System.in);
		double kdvsizTutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
		System.out.print("Kdv'siz tutarı giriniz: ");
		kdvsizTutar = input.nextDouble();
		System.out.println("Kdv'siz tutar: " + kdvsizTutar);
		System.out.println("Kdv oranı: " + kdvOran);
		kdvTutar = kdvsizTutar * kdvOran;
		System.out.println("Kdv tutarı: " + kdvTutar);
		kdvliTutar = kdvsizTutar + kdvTutar;
		System.out.println("Kdv'li tutar: " + kdvliTutar);
	}

}
