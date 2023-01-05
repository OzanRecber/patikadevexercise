package donguler;

import java.util.Scanner;

public class Alistirma1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı değeri giriniz: ");
		int n = input.nextInt();
		for(int i = 1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}

	}

}
