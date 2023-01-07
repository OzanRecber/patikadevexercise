package donguler;

import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int deneme = 3, bakiye = 10000, islem;
		while(deneme>0) {
			System.out.print("Kullanıcı adınızı giriniz: ");
			String kullaniciAdi = input.nextLine();
			System.out.print("Şifrenizi giriniz: ");
			String sifre = input.nextLine();
			if(kullaniciAdi.equals("ozanrecber") && sifre.equals("1990")) {
				System.out.println("Merhaba, TD Bank'a hoşgeldiniz!");
				do {
					System.out.println("Yapmak istediğiniz işlemi seçiniz");
					islem = input.nextInt();
					switch (islem) {
					case 1:
						System.out.println("Para çekme");
						System.out.print("Çekmek istediğiniz tutarı giriniz: ");
						int cekilenTutar = input.nextInt();
						if(cekilenTutar > bakiye) {
							System.out.println("Yetersiz bakiye!");
						}
						else {
							bakiye -= cekilenTutar;
							System.out.println("Güncel bakiyeniz: "+bakiye);
						}
						break;
					case 2:
						System.out.println("Para yatırma");
						System.out.print("Yatırmak istediğiniz tutarı giriniz:");
						int yatirilanTutar = input.nextInt();
						bakiye += yatirilanTutar;
						System.out.println("Güncel bakiyeniz: "+bakiye);
						break;
					case 3:
						System.out.println("Güncel bakiyeniz: "+bakiye);
						break;
					case 4:
						System.out.println("Sistemden çıkış yapıldı!");
						break;
					default:
						System.out.println("Hatalı tuşlama yapıldı!");
					}
				}
					while(islem != 4);
					break;
			}
			else {
				deneme--;
				System.out.println("Kullanıcı adı veya şifreniz hatalıdır!");
				if(deneme == 0) {
					System.out.println("Hesabınız bloke olmuştur, lütfen bankanızla iletişime geçiniz!");
				}
				else {
					System.out.println("Kalan hakkınız: "+deneme);
				}
			}
		}
	
	}

}
