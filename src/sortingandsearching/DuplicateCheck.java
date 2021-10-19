package sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCheck {

	public String solution(int n, int[] arr) {
		String answer = "U";
		
		Arrays.sort(arr);
		
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				answer = "D";
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		DuplicateCheck T = new DuplicateCheck();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) 	arr[i] = sc.nextInt();
		
		System.out.println(T.solution(n, arr));
	}
}
