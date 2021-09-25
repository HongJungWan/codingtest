package dfsbfs;

public class RecursionFunction {

	public void DFS(int n) {
		if (n == 0)
			return;
		else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}

	public void solution(int n) {
		DFS(n);
	}

	public static void main(String[] args) {
		RecursionFunction T = new RecursionFunction();
		
		T.solution(3);
	}

}
