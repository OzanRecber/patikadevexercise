package donguler;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		int s1 = input.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int s2 = input.nextInt();
		int ebob = 1, ekok = 1, i = 1, j = 1;
		if(s1<s2) {
			while(i<=s1) {
				if(s1%i==0 && s2%i==0) {
					ebob = i;
				}
				i++;
			}
		}
		else {
			while(i<=s2) {
				if(s1%i==0 && s2%i==0) {
					ebob = i;
				}
				i++;
			}
		}
		System.out.println("Sayıların Ebob'u = "+ebob);
		while(s1*s2>=j) {
			if(j%s1==0 && j%s2==0) {
				ekok = j;
				break;
			}
			j++;
		}
		System.out.println("Sayıların Ekok'u = "+ekok);
		

	}

}
