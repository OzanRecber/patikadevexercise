package metotlar;

import java.util.Scanner;

public class UsluSayi {
	public static double exponentiate(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if(exponent < 0) {
            exponent = -exponent;
            base = 1/base;
        }
        return base * exponentiate(base, exponent - 1);
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Taban değerini giriniz: ");
        double base =input.nextDouble();
        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();
        double result = exponentiate(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}