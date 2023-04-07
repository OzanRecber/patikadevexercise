package patikaDev;

import java.util.Scanner;

public class PalindromikKelimeler {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kontrol edilecek kelimeyi yazınız: ");
		String str = scan.nextLine();
		System.out.println(isPalindrom(str));
	}

	private static boolean isPalindrom(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
