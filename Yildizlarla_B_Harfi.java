package Diziler;

public class Yildizlarla_B_Harfi {

	public static void main(String[] args) {
		//* * * * i=0     j=0, j=3
		//*     *
		//*     *
		//* * * * i=3
		//*     *
		//*     *
		//* * * * i=6
		
		String[][] b = new String[7][4];
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				if(i == 0 || i ==3 || i==6) {
					System.out.print("* ");
				} else if(j == 0 || j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
		
	}

}
