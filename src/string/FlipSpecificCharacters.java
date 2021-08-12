package string;

import java.util.Scanner;

public class FlipSpecificCharacters {
	public String solution(String str) {
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() - 1;

		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt]))
				lt++;
			else if (!Character.isAlphabetic(s[rt]))
				rt++;
			else {
				char temp;

				temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;

				lt++;
				rt--;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		FlipSpecificCharacters T = new FlipSpecificCharacters();
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(T.solution(str));
	}

}
