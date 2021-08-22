package array;

import java.util.Scanner;

public class Fibonacci {
	public int[] soultion(int n) {
		int[] answer = new int[n];

		answer[0] = 1;
		answer[1] = 1;

		for (int i = 2; i < n; i++) {
			answer[i] = answer[i - 2] + answer[i - 1];
		}

		return answer;

	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int x : fibonacci.soultion(n)) {
			System.out.print(x + " ");
		}

	}

}
