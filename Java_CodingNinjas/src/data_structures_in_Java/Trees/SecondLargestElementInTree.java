package data_structures_in_Java.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SecondLargestElementInTree {
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		if(root.children.size() == 0){
            return null;
        }
      Queue<TreeNode<Integer>> queue = new LinkedList<>();
      TreeNode<Integer> fl=root,sl=null;
      int data = 0;
      queue.add(root);
      //queue.add(null);

      while(!queue.isEmpty())
      {
          TreeNode<Integer> frontNode = queue.poll();
               for(int i=0;i<frontNode.children.size();i++){
                  queue.add(frontNode.children.get(i));
              }
          
              if(frontNode.data >  data){
                  if(frontNode.data > fl.data){
                      sl = fl;
                      data = fl.data;
                      fl = frontNode;
                  }
                  else if (frontNode.data < fl.data){
                      sl = frontNode;
                      data = sl.data;
                  }
              } 
          
          }    
      return sl;
	}

}
