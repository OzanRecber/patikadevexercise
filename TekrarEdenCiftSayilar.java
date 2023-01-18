package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class TekrarEdenCiftSayilar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizinin eleman sayısını giriniz: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Oluşturulan dizi: " + Arrays.toString(arr));
		int[] duplicate = new int[arr.length];
		int startIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] % 2 == 0 && arr[i] == arr[j]) {
					if(!isFind(duplicate, arr[i])) {
						duplicate[startIndex++] = arr[i];
					}
					break;
				}
			}
		}
		System.out.print("Tekrar eden çift sayılar: ");
		for(int value : duplicate) {
			if(value != 0) {
				System.out.print(value + " ");
			}
		}
	}

	private static boolean isFind(int[] arr, int value) {
		for(int i : arr) {
			if(i == value)
				return true;
		}
		return false;
	}
}
