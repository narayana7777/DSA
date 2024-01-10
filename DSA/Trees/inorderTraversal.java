/*Given a Binary Tree, find the In-Order Traversal of it.

Example 1:

Input:
       1
     /  \
    3    2
Output: 3 1 2

Example 2:

Input:
        10
     /      \ 
    20       30 
  /    \    /
 40    60  50
Output: 40 20 60 10 50 30

Your Task:
You don't need to read input or print anything. Your task is to complete the function inOrder() that takes root node of the tree as input and returns a list containing the In-Order Traversal of the given Binary Tree.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 105
0 <= Data of a node <= 105
 */




package Trees;

import java.util.ArrayList;



/**
 * preorder
 */
// User function Template for Java

 /*A Binary Tree node*/

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}

public class preorder {

     ArrayList<Integer> ans = new ArrayList<>();
    ArrayList<Integer> inOrder(Node root) {
        // Code
        //  left root rigth 
         if(root == null) return ans ;
         inOrder(root.left);
         ans.add(root.data);
        //  System.out.println(ans);
         inOrder(root.right);
         
         return ans;
    }
}