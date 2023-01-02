package patikaDev;

import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		// 4'ün katları
		// 100'ün katları olan yıllarda 400'ün de katı olmalı
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl bilgisi giriniz: ");
		int yil = input.nextInt();
		if(yil%100==0) {
			if(yil%400==0) {
				System.out.println("Artık yıldır");
			}
			else {
				System.out.println("Artık yıl değildir");
			}
		}
		else if(yil%4==0) {
			System.out.println("Artık yıldır");
		}
		else {
			System.out.println("Artık yıl değildir");
		}
	}

}
