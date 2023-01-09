package metotlar;

import java.util.Scanner;

public class FibRecursive {
	static int fib(int n) {
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 ...
		// f(n)=f(n-1)+f(n-2)
		Scanner input = new Scanner(System.in);
		System.out.print("Fibonacci serisi için bir sınır sayısı giriniz: ");
		int n = input.nextInt();
		System.out.println(n+" haneli fibonacci serisi: ");
		for(int i=1; i<=n; i++) {
			System.out.print(fib(i)+" ");
		}
	}
}
