package data_structures_in_Java.Trees;

public class NextLargerElement {
	static TreeNode<Integer> sol =null; 
	static void nextLargerElementUtil(TreeNode<Integer> root, int x) 
	{ 
		if (root == null) 
		{
			return;
		}
		if (root.data > x)  
		{
			if (sol==null || root.data<sol.data)
			{
				sol = root; 
			}
		}
	
		for (int i = 0; i <root.children.size(); i++) 
		{
			nextLargerElementUtil(root.children.get(i),x); 
		}
	
	
	} 
		
		
		public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		nextLargerElementUtil(root,n);    
		return sol; 
		}

}
