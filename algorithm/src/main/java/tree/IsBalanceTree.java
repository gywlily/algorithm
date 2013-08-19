package tree;

public class IsBalanceTree {
	public boolean isBalance(Node root){
		if(root == null) return false;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(left < 0 || right < 0) return false;
		return Math.abs(left - right) <= 1;
	}
	
	public int getDepth(Node node){
		if(node == null) return 0;
		int left = getDepth(node.left);
		int right = getDepth(node.right);
		if(left < 0 || right < 0 || Math.abs(left - right) > 1) return -1;
		return (left > right? left : right) + 1;
	}
}
