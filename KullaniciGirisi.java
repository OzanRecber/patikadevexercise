package patikaDev;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName, password;
		System.out.print("Kullanıcı adınızı giriniz: ");
		userName = input.nextLine();
		System.out.print("Şifrenizi giriniz: ");
		password = input.nextLine();
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş yaptınız!");
		}else {
			System.out.println("Kullanıcı adınız veya şifreniz yanlış!");
		}

	}

}
