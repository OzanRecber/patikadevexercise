package metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
	static void toplama() {
		System.out.println("-------------------");
		System.out.println("Toplama işlemi");
		Scanner input = new Scanner(System.in);
		int sayi, sonuc=0;
		for(int i=1; i<=2; i++) {
			System.out.print(i + ". sayı: ");
			sayi = input.nextInt();
			sonuc += sayi;
		}
		System.out.println("Toplama işlemi sonucu: "+sonuc);
		System.out.println("-------------------");
	}
	static void cikarma() {
		System.out.println("-------------------");
		System.out.println("Çıkarma işlemi");
		Scanner input = new Scanner(System.in);
		int sayi, sonuc=0;
		for(int i=1; i<=2; i++) {
			System.out.print(i + ". sayi: ");
			sayi = input.nextInt();
			if(i==1) {
				sonuc = sayi;
				continue;
			}
			sonuc -= sayi;
		}
		System.out.println("Çıkarma işlemi sonucu: "+sonuc);
		System.out.println("-------------------");
	}
	static void carpma() {
		System.out.println("-------------------");
		System.out.println("Çarpma işlemi");
		Scanner input = new Scanner(System.in);
		int sonuc = 1, sayi;
		for(int i=1; i<=2; i++) {
			System.out.print(i + ". sayı: ");
			sayi = input.nextInt();
			if(sayi==0) {
				sonuc = 0;
				continue;
			}
			sonuc *= sayi;
		}
		System.out.println("Çarpma işlemi sonucu: "+sonuc);
		System.out.println("-------------------");
	}
	static void bolme() {
		System.out.println("-------------------");
		System.out.println("Bölme işlemi");
		Scanner input = new Scanner(System.in);
		double sayi, sonuc = 0.0;
		for(int i=1; i<=2; i++) {
			System.out.print(i + ". sayı: ");
			sayi = input.nextDouble();
			if(i==1) {
				sonuc = sayi;
				continue;
			}
			sonuc /= sayi;
		}
		System.out.println("Bölme işlemi sonucu: "+sonuc);
		System.out.println("-------------------");
	}
	static void usluSayi() {
		System.out.println("-------------------");
		System.out.println("Üslü sayı hesaplama işlemi");
		Scanner input = new Scanner(System.in);
		int taban, kuvvet, sonuc=1;
		System.out.print("Taban değerini giriniz: ");
		taban = input.nextInt();
		System.out.print("Üs değerini giriniz: ");
		kuvvet = input.nextInt();
		for(int i=1; i<=kuvvet; i++) {
			sonuc *= taban;
		}
		System.out.println("Üslü ifadenin sonucu: "+sonuc);
		System.out.println("-------------------");
	}
	static void faktoriyel() {
		System.out.println("-------------------");
		System.out.println("Faktöriyel hesaplama işlemi");
		Scanner input = new Scanner(System.in);
		int fak, sonuc=1;
		System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
		fak = input.nextInt();
		for(int i=1; i<=fak; i++) {
			sonuc *= i;
		}
		System.out.println(fak + "! = " + sonuc);
		System.out.println("-------------------");
	}
	static void mod() {
		System.out.println("-------------------");
		System.out.println("Mod alma işlemi");
		Scanner input = new Scanner(System.in);
		int a, b, sonuc;
		System.out.print("1. sayıyı giriniz: ");
		a = input.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		b = input.nextInt();
		sonuc = a % b;
		System.out.println(a + " % " + b + " = "+sonuc);
		System.out.println("-------------------");
	}
	static void dikdortgen() {
		System.out.println("-------------------");
		System.out.println("Dikdörtgenin alanını ve çevresini hesaplama işlemi");
		Scanner input = new Scanner(System.in);
		int a, b, alan, cevre;
		System.out.print("Dikdörtgenin bir kenar uzunluğunu giriniz: ");
		a = input.nextInt();
		System.out.print("Dikdörtgenin diğer kenar uzunluğunu giriniz: ");
		b = input.nextInt();
		alan = a*b;
		cevre = 2*(a+b);
		System.out.println("Dikdörtgenin alanı: "+alan+"\nDikdörtgenin çevresi: "+cevre);
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String menu = "1-Toplama İşlemi"
				+ "\n2-Çıkarma İşlemi"
				+ "\n3-Çarpma İşlemi"
				+ "\n4-Bölme İşlemi"
				+ "\n5-Üslü Sayı Hesaplama"
				+ "\n6-Faktöriyel Hesaplama"
				+ "\n7-Mod Alma"
				+ "\n8-Dikdörtgen Alan ve Çevre Hesabı"
				+ "\n0-Çıkış Yap";
		System.out.println(menu);
		System.out.println("-------------------");
		int secim;
		do {
			System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
			secim = input.nextInt();
			if(secim==0) {
				System.out.println("Sistemden çıkış yapıldı!\nTekrar görüşmek üzere!");
				break;
			}
			switch(secim) {
			case 1:
				toplama();
				break;
			case 2:
				cikarma();
				break;
			case 3:
				carpma();
				break;
			case 4:
				bolme();
				break;
			case 5:
				usluSayi();
				break;
			case 6:
				faktoriyel();
				break;
			case 7:
				mod();
				break;
			case 8:
				dikdortgen();
				break;
			default:
				System.out.println("Hatalı bir seçim yaptınız!");
				break;
			}
		}
		while(secim != 0);
	}

}
