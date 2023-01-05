package donguler;

import java.util.Scanner;

public class Alistirma6 {

	public static void main(String[] args) {
		// Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
		Scanner input = new Scanner(System.in);
		System.out.print("Taban sayısını giriniz: ");
		int taban = input.nextInt();
		System.out.print("Üs sayısını giriniz: ");
		int us = input.nextInt();
		int sonuc = 1;
		for(int i = 1; i <= us; i++) {
			sonuc *= taban;
			
		}
		System.out.println(sonuc);
		

	}

}
