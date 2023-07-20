package data_structures_in_Java.Trees;

public class SumOfAllNodes {
	public static int sumOfAllNode(TreeNode<Integer> root){
		int sum=root.data;
		for(int i =0;i<root.children.size();i++) {
			int sumOfChild =sumOfAllNode(root.children.get(i));
			sum+=sumOfChild;
		}
		return sum;
	}

}
