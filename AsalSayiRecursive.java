package metotlar;

import java.util.Scanner;

public class AsalSayiRecursive {
	static int checkPrime(int number, int number2) {
		if(number2==1) {
			return 0;
		}
		if(number % number2 == 0) {
			return -1;
		} else {
			return checkPrime(number, number2-1);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kontrol edilecek sayıyı giriniz: ");
		int number = input.nextInt();
		int result = checkPrime(number, number-1);
		if(result==0)
			System.out.println(number+" asal sayıdır");
		else
			System.out.println(number+" asal sayı değildir");
	}

}
