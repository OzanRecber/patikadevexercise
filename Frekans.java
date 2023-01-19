package Diziler;

import java.util.Arrays;

public class Frekans {

	public static void main(String[] args) {
		int[] list = {50, 10, 40, 20, 50, 20, 50, 20, 60, 30, 40, 30, 10, 30};
		int[] duplicate = new int[list.length];
		int count = 1;
		int startIndex = 0;
		System.out.println("Dizi : " + Arrays.toString(list));
		System.out.println("Tekrar sayıları ");
		for(int i = 0; i <list.length; i++) {
			for(int j = 0; j <list.length; j++) {
				if(i != j && list[i] == list[j]) {
					count++;
				}
			}
			if(isFind(duplicate, list[i])) {
				duplicate[startIndex++] = list[i];
				System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
			}
			count = 1;
		}
    }
	private static boolean isFind(int[] duplicate, int value) {
		for(int i : duplicate) {
			if(i == value)
				return false;
		}
		return true;
	}
}