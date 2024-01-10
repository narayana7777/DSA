/*
 * 
 * Given a Binary Tree, your task is to find its level order traversal.
For the below tree the output will be 1 $ 2 3 $ 4 5 6 7 $ 8 $.

          1
       /     \
     2        3
   /    \     /   \
  4     5   6    7
    \
     8

Example 1:

Input:
          1
        /
       4
     /   \
    4     2
Output:1 $ 4 $ 4 2 $

Example 2:

Input:
            10
          /    \
        20      30
     /     \
    40     60
Output: 10 $ 20 30 $ 40 60 $
Your Task:
This is a function problem. You don't need to read input. Just complete the function levelOrder() that takes nodes as parameter and returns level order traversal as a 2D list.

Note: The driver code prints the levels '$' separated.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of edges <= 1000
0 <= Data of a node <= 100


*/


package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class levelOrderTraversal_lineByLine {

    static ArrayList<ArrayList<Integer>> levelOrder(Node node){
        // Your code here
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<ArrayList<Integer>> FAns = new ArrayList<>();
        if(node==null) return FAns;
        q.offer(node);
        while(!q.isEmpty()){
            int sz = q.size();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<sz;i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.add(q.peek().right);
                ans.add(q.poll().data);
            }
            FAns.add(ans);
        }
        return FAns;
    }
}
