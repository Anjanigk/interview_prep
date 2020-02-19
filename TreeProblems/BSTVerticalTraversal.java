package TreeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class BSTVerticleTraversal {
	
	

}
class Node{
	int data;
	Node left,right;
	Node(int item){
		data = item;
		left =right = null;
		
	}
}
class BinaryTree
{
    static void verticalOrder(Node root)
    {
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        int hd = 0;
        getVerticalOrder(root,hd,map);
        List<Integer> result = new ArrayList<>();
         for(Integer key:map.keySet()) {
        	result.addAll(map.get(key));
        }
         for(int list : result) {
        	 System.out.print(list);
         }
        	
    }
    
    static void getVerticalOrder(Node root,int hd,TreeMap<Integer,ArrayList<Integer>> map)
    {
     if(root == null){
         return;
     }
     ArrayList<Integer> list = map.get(hd);
     if(list == null){
         list = new ArrayList<>();
     }
     list.add(root.data);
     map.put(hd,list);
     getVerticalOrder(root.left,hd-1,map);
     
     getVerticalOrder(root.right,hd+1,map);   
        
    }
    static void printInOrder(Node root) {
    	if (root == null) 
    		return;
    		printInOrder(root.left);
    		System.out.println(root.data);
    		printInOrder(root.right);
    }
    static void printPreOrder(Node root) {
    	if (root == null) 
    		return;
    	System.out.println(root.data);
		printInOrder(root.left);
    	printInOrder(root.right);
    }
    static void printPostOrder(Node root) {
    	if (root == null) 
    		return;
    	printInOrder(root.left);
    	printInOrder(root.right);
    	System.out.println(root.data);
		
    }
    
 }

