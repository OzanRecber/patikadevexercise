package donguler;

import java.util.Scanner;

public class YildizlarlaElmasYapma {

	public static void main(String[] args) {
		// Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
		
	  //    *			1				4				1
      //   *** 			2				3				3
	  //  *****			3				2				5
	  // *******		4				1				7
	  //*********		5				0				9
	  //   n=5	   satır sayısı	  boşluk sayısı	  yıldız sayısı
	  //				i			   n-i			  2i-1
		
	  // *******		1				0				7
	  //  *****			2				1				5
	  //   ***			3				2				3
	  //    *			4				3				1
	  //   n-1 	   satır sayısı	  boşluk sayısı	  yıldız sayısı
	  //			  i = n-1		   n-i	 		  2i-1
		
		Scanner input = new Scanner(System.in);
		System.out.print("Satır sayısını giriniz: ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
