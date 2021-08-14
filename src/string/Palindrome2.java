package string;

import java.util.Scanner;

public class Palindrome2 {

	public String solution(String str) {

		String answer = "NO";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();

		if (str.equals(tmp)) {
			answer = "YES";
		}

		return answer;
	}

	public static void main(String[] args) {
		Palindrome2 palindrome2 = new Palindrome2();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();

		System.out.println(palindrome2.solution(str));
	}

}
