package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayiyaEnYakinSayilar {

	public static void main(String[] args) {
	// Dizideki sayılar içinde girilen sayıdan küçük ve girilen sayıdan büyük girilen sayıya en yakın sayıları yazdıran program
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin eleman sayısını giriniz: ");
		int n = input.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < list.length; i++) {
			System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
			list[i] = input.nextInt();
		}
		System.out.println("Olusturulan dizi: " + Arrays.toString(list));
		findNumbers(list, n);	
	}
	private static void findNumbers(int[] list, int n) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kontrol edilecek sayıyı giriniz: ");
		int number = input.nextInt();
		int down = Integer.MIN_VALUE;
		int up = Integer.MAX_VALUE;
		for(int i : list) {
			if(i == number) {
				down = i;
				up = i;
			}
			if(i < number) {
				if(i > down) {
					down = i;
				}
			}
			if(i > number) {
				if(i < up) {
					up = i;
				}
			}
		}
		System.out.println("Girilen sayıdan küçük en yakın sayı: " + down);
		System.out.println("Girilen sayıdan büyük en yakın sayı: " + up);
	}
}