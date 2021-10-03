package dfsbfs;

public class Fibo {

	public int DFS(int n) {
		if (n == 1) return 1;
		else if (n == 2) return 1;
		else return DFS(n - 2) + DFS(n - 1);
	}

	public static void main(String[] args) {
		Fibo T = new Fibo();
		
		int n = 7;
		
		for (int i = 1; i <= n; i++) System.out.print(T.DFS(i) + " ");
	}

}
