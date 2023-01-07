package donguler;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		//*********			5				0				9
		// *******			4				1				7
		//  *****			3				2				5	
		//   ***			2				3				3
		//    *				1				4				1
		//	 n=5	   satır sayısı	  boşluk sayısı	  yıldız sayısı
		//					i			   n-i			  2i-1
		Scanner input = new Scanner(System.in);
		System.out.print("Satır sayısı giriniz: ");
		int n = input.nextInt();
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
