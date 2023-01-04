package donguler;

import java.util.Scanner;

public class GirilenSayiyaKadar3ve4eBolunenler {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı değeri giriniz: ");
		int n = input.nextInt();
		int i = 0;
		while(i<=n) {
			if(i%3==0 && i%4==0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
	}

}
