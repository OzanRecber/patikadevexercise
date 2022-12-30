package patikaDev;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. sayıyı giriniz: ");
		double n1 = input.nextDouble();
		System.out.println("2. sayıyı giriniz: ");
		double n2 = input.nextDouble();
		System.out.println("Seçim yapınız\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		int select = input.nextInt();
		
		switch(select) {
			case 1:
				double toplama = n1+n2;
				System.out.println("Toplama işlemi sonucu:" + toplama);
				break;
			case 2:
				double cikarma = n1-n2;
				System.out.println("Çıkarma işlemi sonucu: " + cikarma);
				break;
			case 3:
				double carpma = n1*n2;
				System.out.println("Çarpma işlemi sonucu: " + carpma);
				break;
			case 4:
				if(n2==0) {
					System.out.println("Herhangi bir sayı sıfıra bölünemez!");
				}
				double bolme = n1/n2;
				System.out.println("Bölme işlemi sonucu: " + bolme);
				break;
			default:
				System.out.println("Hatalı giriş yaptınız!");
		}
		
	}

}
