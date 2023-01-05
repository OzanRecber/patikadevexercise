package donguler;

import java.util.Scanner;

public class Alistirma4 {

	public static void main(String[] args) {
		//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
		  Scanner input = new Scanner(System.in);
		  System.out.print("Sınır sayısı giriniz: ");
		  int n = input.nextInt();
		  for(int i = 1; i <= n; i *= 4) {
			  System.out.print(i + " ");
		  }
		  System.out.println("\n----------");
		  for(int j = 1; j <= n; j *= 5) {
			  System.out.print(j + " ");
		  }
	}

}
