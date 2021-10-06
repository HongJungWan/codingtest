
class Node {
	int data;
	Node lt, rt;

	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class TerminalNodeShortestPath {
	Node root;

	public int DFS(int K, Node root) {
		if (root.lt == null && root.rt == null) return K;
		else return Math.min(DFS(K + 1, root.lt), DFS(K + 1, root.rt));
	}

	public static void main(String args[]) {
		TerminalNodeShortestPath tree = new TerminalNodeShortestPath();
		
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		System.out.println(tree.DFS(0, tree.root));
	}
}
