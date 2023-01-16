package Diziler;

import java.util.Scanner;

public class OrtalamaHesaplama {
	public static double ortalama(double[] list) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		for(int i = 0; i < list.length; i++) {
			System.out.print("Dizinin "+(i+1)+". eleman sayısını giriniz: ");
			list[i] = input.nextDouble();
			sum += list[i];
		}
		double avarage = sum/list.length;
		return avarage;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ortalaması hesaplanacak olan dizinin eleman sayısını giriniz: ");
		int n = input.nextInt();
		double[] list = new double[n];
		System.out.println("Dizinin elemanlarının ortalama değeri: " + ortalama(list));
	}

}
