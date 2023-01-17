package donguler;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		// Java ile kombinasyon hesaplayan program yazınız.
		// Kombinasyon formülü
		// C(n,r) = n! / (r! * (n-r)!)
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kombinasyonu alınacak 1. sayıyı giriniz: ");
		int n = input.nextInt();
		int sonuc1 = 1;
		for(int i = 1; i <= n; i++) {
			sonuc1 *= i;
		}
		
		System.out.print("Kombinasyonu alınacak 2. sayıyı giriniz: ");
		int r = input.nextInt();
		int sonuc2 = 1;
		for(int j = 1; j <= r; j++) {
			sonuc2 *= j;
		}
		
		int sonuc3 = 1;
		for(int k = 1; k <= (n-r); k++) {
			sonuc3 *= k;
		}
		
		int sonuc = sonuc1/(sonuc2*sonuc3);
		System.out.println("C(n,r) = " + sonuc);
		

	}

}
