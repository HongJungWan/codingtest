package string;

import java.util.Scanner;

public class FindLongWords {

	public String solution(String str) {

		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");

		for (String x : s) {
			int len = x.length();
			if (len > m) {
				m = len;
				answer = x;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		FindLongWords T = new FindLongWords();
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(T.solution(str));
	}

}
