package donguler;

import java.util.Scanner;

public class CiftVeDordunKatlari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*Ödev
		 *Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
		 *değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
		 */
		int n, total=0;
		do {
			System.out.print("Bir değer giriniz: ");
			n = input.nextInt();
			if(n%4==0) {
				total += n;
			}
		}
		while(n%2==0);
		System.out.println("Toplam: " + total);
		

	}

}
