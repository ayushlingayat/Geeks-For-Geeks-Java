//Foldable Binary Tree
//MediumAccuracy: 50.45%Submissions: 28723Points: 4
//Given a binary tree, check if the tree can be folded or not. A tree can be folded if left and right subtrees of the tree are structure wise same. An empty tree is considered as foldable.
//Consider the below trees:
//(a) and (b) can be folded.
//(c) and (d) cannot be folded.
//
//
//(a)
//       10
//     /    \
//    7      15
//     \    /
//      9  11
//(b)
//        10
//       /  \
//      7    15
//     /      \
//    9       11
//(c)
//        10
//       /  \
//      7   15
//     /    /
//    5   11
//(d)
//         10
//       /   \
//      7     15
//    /  \    /
//   9   10  12
// 
//Example 1:
//
//Input:
//     10
//    /    \
//   7     15
// /  \   /  \
//N   9  11   N
//Output:Yes
//Explaination:Structure of every left and right subtree are same. 
//Example 2:
//
//Input:
//      10
//    /    \
//   7     15
// /  \   /  \
//5   N  11   N
//Output: No
//Explaination: 7's left child is not NULL and right child is NULL. That's why the tree is not foldable. 
//
//
//Your Task:
//The task is to complete the function isFoldable() that takes root of the tree as input and returns true or false depending upon whether the tree is foldable or not.
//
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(Height of the Tree).
//
//Constraints:
//0 <= n <= 103
//1 <= data of node <= 104
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class Tree
{
    //Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node node) 
	{ 
		// your code 
		return helper(node,node);
	} 
	
	boolean helper(Node node1,Node node2)
	{
	    if(node1==null && node2==null)
	    {
	        return true;
	    }
	    
	    if((node1==null && node2!=null)||(node1!=null && node2==null))
	    {
	        return false;
	    }
	    
	    return helper(node1.left,node2.right)&&helper(node1.right,node2.left);
	}
}