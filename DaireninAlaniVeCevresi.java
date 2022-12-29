package patikaDev;

import java.util.Scanner;

public class DaireninAlaniVeCevresi {

	public static void main(String[] args) {
		// Alan = pi * r * r
		// Çevre = 2 * pi * r
		
		Scanner input = new Scanner(System.in);
		int r;
		double alan, cevre, pi = 3.14;
		System.out.print("Dairenin yarıçapını giriniz: ");
		r = input.nextInt();
		alan = pi*r*r;
		System.out.println("Dairenin alanı: " + alan);
		cevre = 2*pi*r;
		System.out.println("Dairenin çevresi: " + cevre);

	}

}
