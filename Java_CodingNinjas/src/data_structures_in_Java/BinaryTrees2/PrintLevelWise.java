package data_structures_in_Java.BinaryTrees2;

import java.util.*;

public class PrintLevelWise {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> nodesToPrint=new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front = nodesToPrint.poll();
            System.out.print(front.data+":");
            if (front.left!=null)
            {
                nodesToPrint.add(front.left);
                System.out.print("L:"+front.left.data);
            }
            else
            {
                System.out.print("L:-1");
            }
            
            if (front.right!=null)
            {
                nodesToPrint.add(front.right);
                System.out.print(",R:"+front.right.data);
            }
            else
            {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
	}

}
