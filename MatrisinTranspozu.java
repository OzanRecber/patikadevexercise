package Diziler;

public class MatrisinTranspozu {

	public static void main(String[] args) {
        int[][] matris = {{2, 3, 5}, {1, 4, 8}};
        System.out.println("Matris :");
        printMatris(matris);
        
        int[][] transpoze = new int[matris[0].length][matris.length];
        for(int i = 0; i < matris[0].length; i++) {
        	for(int j = 0; j < matris.length; j++) {
        		transpoze[i][j] = matris[j][i];
        	}
        }
        System.out.println("Transpoze :");
        printMatris(transpoze);
	}
	private static void printMatris(int[][] matris) {
		for(int[] i : matris) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}