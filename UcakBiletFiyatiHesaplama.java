package patikaDev;

import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {

	public static void main(String[] args) {
		// Yolculuk tipi 1-Tek yön, 2-Gidiş/Dönüş
		// Yaş İndirimi yaş<12 ise %50 indirim, 12-24 arası %10 indirim, yaş>65 ise %30 indirim
		// Gidiş/Dönüş seçilmişse %20 indirim uygulansın.
		// km başı 0.10 $ hesaplansın
		
		Scanner input = new Scanner(System.in);
		System.out.print("Km bilgisi giriniz: ");
		int km = input.nextInt();
		System.out.print("Yaş bilgisi giriniz: ");
		int yas = input.nextInt();
		double fiyat = 0.10*km;
		if(yas<12) {
			fiyat = fiyat*0.50;
		}
		else if(yas>=12 && yas<24) {
			fiyat = fiyat * 0.90;
		}
		else if(yas>=65) {
			fiyat = fiyat*0.70;
		}
		System.out.print("Yolculuk tipini giriniz (1-Tek yön, 2-Gidiş/Dönüş): ");
		int tip = input.nextInt();
		switch(tip) {
			case 1:
				System.out.println("Bilet fiyatı = "+fiyat);
				break;
			case 2:
				fiyat = fiyat*2*0.80;
				System.out.println("Bilet fiyatı = "+fiyat);
				break;
			default:
				System.out.println("Hatalı seçim yaptınız!");
		}
		
		
	}

}
