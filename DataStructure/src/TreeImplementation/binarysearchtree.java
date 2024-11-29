package TreeImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class binarysearchtree {

    private Node root;
    private int count;
    private boolean flag;
    
    public boolean add(int key) {
    	flag = true;
    	root=addnode(root,key);
    	return flag;
    }
    
    private Node addnode(Node n , int key) {
    	if(n==null) {
    		n=new Node(key);
    		count++;
    		return n;
    	}
    	if(key<n.key) {
    		n.left=addnode(n.left,key);
    	}
    	else if(key>n.key) {
    		n.right=addnode(n.right,key);
    	}else {
    		flag = false;
    	}
    	return n;
    }
    
    public void levelorder() {
    	Queue q = new LinkedList();
    	if(root != null) q.add(root);
    	
    	
    	while(!q.isEmpty()) {
    		Node n = (Node) q.poll();
    		System.out.print(n.key + " ");
    		if(n.left != null) q.add(n.left);
    		if(n.right != null) q.add(n.right);
    	}
    }
    
    public void preorder() {
    	
    	preorder(root);
    	System.out.println();
    }
    	private void preorder(Node n){
    		if(n==null)return;
    		System.out.print(n.key + "");
    		preorder(n.left);
    		preorder(n.right);
         }
    
    public void postorder() {
    	postorder(root);
    	System.out.println();
    }
    
    private void postorder(Node n) {
    	if(n==null) return;
    	
    	postorder(n.left);
    	postorder(n.right);
    	System.out.print(n.key+" ");
    }
    
    public void inorder() {
    	
    	
    	
    }
    private void inorder(Node n) {
    	if(n==null)return;
    	inorder(n.left);
    	System.out.print(n.key);
    	inorder(n.right);
    }
    
    public int smallest() {
    	Node MinNode = minNode (root);
    	return MinNode.key;
    }
    
     Node minNode(Node n) {
    	 if(n.left==null) return n;
    	 return minNode(n.left);
     }
      Node removeNode(Node n ,int key) {
    	  if (n==null) {
    		  return n;
    	  }
		if(key<n.key) {
			n.left=removeNode(n.left,key);
		}else if(key > n.key) {
			n.right = removeNode(n.right,key);
		}else {
			if(n.left == null && n.right == null) {
				n=null;
			}else if(n.left == null) {
				n= n.right;
			}else if(n.right==null) {
				n=n.left;
			}else {
				Node minNode = minNode(n.right);
				int temp = n.key;
				n.key=minNode.key;
				minNode.key=temp;
				n.right=removeNode(n.right,key);
			}
		}
		return n;
      }
}
