package data_structures_in_Java.BinaryTrees2;

public class isBalanced {
	public static BalancedTreeReturn Balanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			int height =0;
			boolean isBal =true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height=height;
			ans.isBalanced=isBal;
			return ans ;
		}
		BalancedTreeReturn leftOutput =Balanced(root.left);
		BalancedTreeReturn rightOutput = Balanced(root.right);
		boolean isBal=true;
		int height =1+Math.max(leftOutput.height, rightOutput.height);
		
		if(Math.abs(leftOutput.height-rightOutput.height)>1) {
			isBal=false;
		}
		if(!leftOutput.isBalanced||!rightOutput.isBalanced) {
			isBal=false;
		}
		BalancedTreeReturn ans =new BalancedTreeReturn();
		ans.height=height;
		ans.isBalanced=isBal;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
