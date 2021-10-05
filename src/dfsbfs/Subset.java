package dfsbfs;

public class Subset {

	static int n;
	static int[] ch;

	public void DFS(int L) {
		if (L == n + 1) {
			String tmp = "";
			
			for (int i = 1; i <= n; i++) {
				if (ch[i] == 1) tmp += (i + " ");
			}
			if (tmp.length() > 0) System.out.println(tmp); // 공집합 출력 x
		} else {
			ch[L] = 1; // 왼쪽 방향, 부분집합에 포함
			DFS(L + 1);
			
			ch[L] = 0; // 오른족 방향, 부분집합에 포함 x
			DFS(L + 1);
		}
	}

	public static void main(String[] args) {
		Subset T = new Subset();
		
		n = 2;
		ch = new int[n + 1];
		
		T.DFS(1);
	}
}
