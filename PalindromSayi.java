package metotlar;

import java.util.Scanner;

public class PalindromSayi {
	static boolean isPalindrom(int number) {
		int temp=number, reverseNumber=0, lastNumber;
		while(temp>0) {
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
		}
		if(number==reverseNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		//Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
		//Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
		Scanner input = new Scanner(System.in);
		int number;
		do {
			System.out.print("Bir sayı giriniz: ");
			number = input.nextInt();
			if(isPalindrom(number)==true)
				System.out.println("Girilen sayı bir palindrom sayıdır.");
			else
				System.out.println("Girilen sayı bir palindrom sayı değildir.");
		}
		while(number>=0);
	}
}
