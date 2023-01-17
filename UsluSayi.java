package donguler;

import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		// Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
		Scanner input = new Scanner(System.in);
		System.out.print("Taban sayısını giriniz: ");
		double taban = input.nextDouble();
		System.out.print("Üs sayısını giriniz: ");
		int us = input.nextInt();
		double sonuc = 1;
		if(us < 0) {
			us = -us;
			taban = 1/taban;
			for(int i = 1; i <= us; i++) {
				sonuc *= taban;
			}
		} else {
			for(int i = 1; i <= us; i++) {
				sonuc *= taban;	
			}
		}
		System.out.println("Sonuç: " + sonuc);
	}
}
