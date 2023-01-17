package Diziler;

import java.util.Scanner;

public class GirilenSayiyaEnYakinSayilar {

	public static void main(String[] args) {
		// Dizideki sayılar içinde girilen sayıdan küçük ve girilen sayıdan büyük en yakın sayıları yazdıran program
		// Örnek; 5 girildiyse dizimize göre 2 ve 7'yi ekrana yazmalı
		
		Scanner input = new Scanner(System.in);
		int[] list = {32, -16, 7, -20, 11, 45, 2};
		System.out.print("Bir sayı giriniz: ");
		int n = input.nextInt();
		findNumbers(list, n);

	}
	public static void findNumbers(int[] list, int num) {
		int larger = Integer.MAX_VALUE;
		int smaller = Integer.MIN_VALUE;
		for(int i : list) {
			if(i == num) {
				smaller = i;
				larger = i;
			}
			if(i < num) {
				if(i > smaller) {
					smaller = i;
				}
			}
			if(i > num) {
				if(i < larger) {
					larger = i;
				}
			}
		}
		System.out.println("Girilen sayıdan küçük en yakın sayı: " + smaller);
		System.out.println("Girilen sayıdan büyük en yakın sayı: " + larger);
	}

}
