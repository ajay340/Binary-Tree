package Binary_Tree;


public class BinMax implements bintreeVisitor<Integer,Integer>
{
	
	// Purpose: returns the Min value of empty tree. 
	public  Integer emptyTree() {
		return Integer.MIN_VALUE;
		}
	// Purpose: returns the root as the max of the bintree. 
	public Integer leafnode (Integer root) {
		return root;
		}
	
	// Purpose: takes as input the root, left tree, and right tree, and returns the max integer from them. 
	public Integer interiornode(Integer root, bintree<Integer> l, bintree<Integer> r) {
		return Math.max(root, Math.max(l.visit(this), r.visit(this)));
		}
	
	
	


}