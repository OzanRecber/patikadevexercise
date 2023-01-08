package donguler;

public class AsalSayi {

	public static void main(String[] args) {
		// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
		int sayac = 0;
		for(int i = 2; i<=100; i++) {
			for(int j = 1; j <= i; j++) {
				if(i%j==0)
					sayac++;
			}
			if(sayac==2) {
				System.out.print(i+" ");
			}
			sayac = 0;
		
		}

	}

}
