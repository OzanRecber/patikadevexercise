package donguler;

import java.util.Scanner;

public class MaxMinSayiBulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kontrol, sayi, max=0, min=0;
		System.out.print("Kontrol edilecek sayı adedini giriniz: ");
		kontrol = input.nextInt();
		for(int i=1; i<=kontrol; i++) {
			System.out.print(i +". sayıyı giriniz: ");
			sayi = input.nextInt();
			if(i==1) {
				max=sayi;
				min=sayi;
			}
			if(sayi>max) {
				max=sayi;
			}
			else if(sayi<min) {
				min=sayi;
			}
		}
		System.out.println("Girilen sayılar içinden en büyüğü: "+max);
		System.out.println("Girilen sayılar içinden en küçüğü: "+min);

	}

}
