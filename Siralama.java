package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class Siralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Dizinin elemanlarını giriniz: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+". Elemanı: ");
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("Sıralama: ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
