package slidingwindow;

import java.util.Scanner;

public class SumConsecutiveNaturalNumbers2 {

	public int solution(int n) {
		int answer = 0, cnt = 1;

		n--;

		while (n > 0) {
			cnt++;
			n = n - cnt;

			if (n % cnt == 0)
				answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		SumConsecutiveNaturalNumbers2 T = new SumConsecutiveNaturalNumbers2();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.print(T.solution(n));
	}
}
