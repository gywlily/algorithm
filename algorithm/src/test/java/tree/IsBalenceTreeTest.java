package tree;

import org.junit.Assert;
import org.junit.Test;

public class IsBalenceTreeTest {
	@Test
	public void testIsBalence(){
		IsBalanceTree ibt = new IsBalanceTree();
		boolean ret = ibt.isBalance(createBalanceTree());
		Assert.assertEquals(true, ret);
	}
	
	public void testIsUnBalance(){
		IsBalanceTree ibt = new IsBalanceTree();
		boolean ret = ibt.isBalance(createUnBalanceTree());
		Assert.assertEquals(false, ret);
	}
	
	private Node createBalanceTree(){
		Node root = new Node(7);
		root.left = new Node(4);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		return root;
	}
	
	private Node createUnBalanceTree(){
		Node root = new Node(7);
		root.left = new Node(4);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(5);
		root.left.right.left = new Node(62);
		return root;
	}
}
