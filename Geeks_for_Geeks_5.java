//Number of Turns in Binary Tree
//HardAccuracy: 44.27%Submissions: 10206Points: 8
//Given a binary tree and data value of two of its nodes. Find the number of turns needed to reach from one node to another in the given binary tree.
//
//Example 1:
//
//Input:      
//Tree = 
//           1
//        /    \
//       2       3
//     /  \     /  \
//    4    5   6    7                        
//   /        / \                        
//  8        9   10   
//first node = 5
//second node = 10
//Output: 4
//Explanation: 
//Turns will be at 2, 1, 3, 6.
//Example 2:
//
//Input:      
//Tree = 
//           1
//        /     \
//       2        3
//     /  \      /  \
//    4    5    6    7                        
//   /         / \                        
//  8         9   10   
//first node = 1
//second node = 4  
//Output: -1
//Explanation: No turn is required since 
//they are in a straight line.
//
//Your Task:  
//You don't need to read input or print anything. Complete the function NumberOFTurns() which takes root node and data value of 2 nodes as input parameters and returns the number of turns required to navigate between them. If the two nodes are in a straight line, ie- the path does not involve any turns, return -1.
//
//
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(Height of Tree)
//
//
//Constraints:
//1 ≤ N ≤ 10^3

