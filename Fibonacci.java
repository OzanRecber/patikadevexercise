package donguler;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 ...
		Scanner input = new Scanner(System.in);
		int ilkDeger=0, ikinciDeger=1;
		int fib=0;
		System.out.print("Kaç haneli bir fibonacci serisi görmek istersiniz: ");
		int n = input.nextInt();
		System.out.print(n + " haneli bir fibonacci serisi: "+ilkDeger+" "+ikinciDeger);
		for(int i=2; i<n; i++) {
			fib=ilkDeger+ikinciDeger;
			ilkDeger=ikinciDeger;
			ikinciDeger=fib;
			System.out.print(" "+fib);
		}
	}
}
