package string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();

		for (String x : str) {
			String temp = new StringBuilder(x).reverse().toString();
			answer.add(temp);
		}

		return answer;
	}

	public static void main(String[] args) {
		ReverseString T = new ReverseString();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}

}
