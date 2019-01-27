package Binary_Tree;

public class postOrderTraversal implements bintreeVisitor<Integer, String>{
	
	public String emptyTree() {
		//purpose: To return the elements of an empty tree as a string. It's an empty string because the tree is empty.
		return "";
	}
	
    public String leafnode(Integer val){ 
    	//purpose: To convert the value of this leaf node to a string.
    	return Integer.toString(val);    	
    }
    
    public String interiornode(Integer val, bintree<Integer> l, bintree<Integer> r){
    	//purpose: To return the values of the left side of the tree, right side of the tree and the root in that order.
    	return l.visit(this) + " "+  r.visit(this) + " "+ val;
    }

}