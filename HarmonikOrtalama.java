package Diziler;

import java.util.Scanner;

public class HarmonikOrtalama {

	public static void main(String[] args) {
		// Harmonik seri = 1/1+1/2+1/3+1/4+...+1/n
		// Harmonik ortalama = eleman sayısı / elemanların harmonik serisi
		Scanner input = new Scanner(System.in);

        double[] harmonic = new double[5];
        double total = 0;

        for (int i = 0; i < harmonic.length; i++) {
            System.out.print(i + ". indisli elemanı girin: ");
            harmonic[i] = input.nextDouble();

            total = total + (1 / harmonic[i]);
        }
        
        System.out.println("Sayiların harmonik serisi: " + total);
        System.out.println("Harmonik ortalama: " + (harmonic.length / total));
    }
}