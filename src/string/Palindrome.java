package string;

import java.util.Scanner;

public class Palindrome {
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				answer = "NO";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();

		System.out.println(palindrome.solution(str));
	}

}

/*
 * String answer="NO"; 
 * String temp=new StringBuilder(str).reverse().toString();
 * if(str.equalsIgnoreCase(temp)) answer="YES"; 
 * return answer;
 * 
 */
