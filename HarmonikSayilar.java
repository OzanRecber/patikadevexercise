package donguler;

import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		// Harmonik sayılar: 1/1+1/2+1/3+1/4+...+1/n
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı değeri giriniz: ");
		double n = input.nextDouble();
		double h = 0;
		for(double i = n; i > 0; i--) {
			h += 1/i;
		}
		System.out.println(h);

	}

}
