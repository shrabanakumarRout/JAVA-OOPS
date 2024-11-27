package TreeImplementation;

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
    

}
