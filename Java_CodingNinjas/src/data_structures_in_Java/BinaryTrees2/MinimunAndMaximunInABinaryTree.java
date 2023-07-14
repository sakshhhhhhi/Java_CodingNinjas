package data_structures_in_Java.BinaryTrees2;

public class MinimunAndMaximunInABinaryTree {
	private static Pair<Integer,Integer> maxMin=new Pair<Integer,Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		getMinAndMaxHelper(root);
        return maxMin;
	}
	public static void getMinAndMaxHelper(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}
		int rootData=root.data;
		int max =maxMin.maximum;
		if(rootData>max){
			maxMin.maximum=root.data;
		}
	    int min =maxMin.minimum;
		if(rootData<min){
			maxMin.minimum=root.data;
		}
		getMinAndMaxHelper(root.left);
		getMinAndMaxHelper(root.right);
	}

}
