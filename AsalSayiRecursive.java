package metotlar;

import java.util.Scanner;

public class AsalSayiRecursive {
	public static boolean isPrime(int n) {
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı değeri giriniz: ");
		int n = input.nextInt();
		boolean result = isPrime(n);
		if(result==true) {
			System.out.println(n+" sayısı asaldır");
		}
		else
			System.out.println(n+" sayısı asal değildir");

	}

}
