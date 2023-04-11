package mayinTarlasi;

import java.util.Scanner;

public class main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int row, column;

		System.out.println("Welcome to the minesweeper game!");
		System.out.println("Please enter the dimensions you want to play with: ");
		System.out.print("Number of row: ");
		row = scan.nextInt();
		System.out.print("Number of column: ");
		column = scan.nextInt();

		MineSweeper mine = new MineSweeper(row, column);
		mine.run();
	}
}