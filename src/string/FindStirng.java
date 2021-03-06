package string;

import java.util.*;

public class FindStirng {
	public int solution(String str, char c) {
		int answer = 0;

		str = str.toUpperCase();
		c = Character.toUpperCase(c);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		FindStirng T = new FindStirng();
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char c = sc.next().charAt(0);

		System.out.print(T.solution(str, c));
	}

}
