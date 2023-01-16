package Diziler;

import java.util.Scanner;

public class HarmonikOrtalama {

	public static void main(String[] args) {
		// Harmonik seri = 1/1+1/2+1/3+1/4+...+1/n
		// Harmonik ortalama = eleman sayısı / elemanların harmonik serisi
		Scanner input = new Scanner(System.in);
		System.out.print("Harmonik ortalaması hesaplanacak dizinin eleman sayısını giriniz: ");
		int n = input.nextInt();
		double[] dizi = new double[n];
		
		double harmonikSeri = 0;
		for(int i = 0; i < dizi.length; i++) {
			System.out.print("Dizinin " + (i+1) +". elemanını giriniz: ");
			dizi[i] = input.nextDouble();
			harmonikSeri += 1/dizi[i];
		}
		System.out.print("Oluşturulan dizi: [");
		for(int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]);
			if(i<n-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		double harmonikOrtalama = dizi.length/harmonikSeri;
		System.out.println("\nDizinin Harmonik ortalaması: "+harmonikOrtalama);
		
		
	}

}
