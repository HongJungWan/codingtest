package string;

import java.util.Scanner;

public class ExtractOnlyNumbers {

	public int solution(String str) {

		String answer = "";

		for (char x : str.toCharArray()) {

			if (Character.isDigit(x)) {
				answer += x;
			}
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		ExtractOnlyNumbers extractOnlyNumbers = new ExtractOnlyNumbers();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();

		System.out.println(extractOnlyNumbers.solution(str));
	}

}
