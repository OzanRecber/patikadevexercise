package Diziler;

import java.util.Scanner;

public class HarmonikOrtalama {

	public static void main(String[] args) {
		// Harmonik seri = 1/1+1/2+1/3+1/4+...+1/n
		// Harmonik ortalama = eleman sayısı / elemanların harmonik serisi
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Harmonik ortalaması hesaplanacak dizinin eleman sayısını giriniz: ");
		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
		System.out.print("Dizinin " + (i+1) + ". elemanını giriniz:");
		list[i] = sc.nextInt();
		}
		System.out.print("Oluşturulan dizi: [");
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i]);
			if(i<n-1)
		    System.out.print(", ");
		}
		System.out.print("]");
		System.out.println("\nHarmonik Ortalama: " + harmonikOrtalama(list));
	}
	public static double harmonikOrtalama(int[] dizi) {
		double toplam = 0;
		for (int i : dizi) {
			toplam += 1.0 / i;
		}
		return dizi.length / toplam;
	}
}