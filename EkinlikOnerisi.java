package patikaDev;

import java.util.Scanner;

public class EkinlikOnerisi {

	public static void main(String[] args) {
		//Sıcaklık < 5  kayak,
		//5 <= sıcaklık < 15 sinema,
		//10 <= sıcaklık < 25 piknik,
		//sıcaklık >= 25 yüzme önerisinde bulunsun.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sıcaklık bilgisi giriniz: ");
		int heat = input.nextInt();
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz!");
		}
		else if(heat<25) {
			if(heat>=5 && heat<15) {
				System.out.println("Sinemaya gidebilirsiniz!");
			}
			if(heat>=10 && heat<25) {
				System.out.println("Pikniğe gidebilirsiniz!");
			}
		}
		else {
			System.out.println("Yüzmeye gidebilirsiniz!");
		}
		

	}

}
