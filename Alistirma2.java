package donguler;

import java.util.Scanner;

public class Alistirma2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı değeri giriniz: ");
		int num = input.nextInt(); // verilen sayı
	    int sum = 0; // toplam değişkeni
	    int count = 0; // sayı sayacı

	    for (int i = 1; i <= num; i++) {
	      if (i % 3 == 0 && i % 4 == 0) { // i 3 ve 4'e tam bölünüyorsa
	    	  System.out.print(i+" ");
	        sum += i; // toplama ekle
	        count++; // sayı sayacını arttır
	      }
	    }

	    double average = (double) sum / count; // ortalama hesapla
	    System.out.println("\nOrtalama: " + average);


	}

}
