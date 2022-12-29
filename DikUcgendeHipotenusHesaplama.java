package patikaDev;

import java.util.Scanner;

public class DikUcgendeHipotenusHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		double c;
		System.out.print("1. kenarı giriniz: ");
		a = input.nextInt();
		System.out.print("2. kenarı giriniz: ");
		b = input.nextInt();
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs: " + c);
		
		

	}

}
