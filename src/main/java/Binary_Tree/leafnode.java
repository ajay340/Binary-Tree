package Binary_Tree;

public class leafnode<X> extends Abintree<X> {
	//Purpose: takes a parametric input of the val
	public leafnode(X v) {
		val = v;
	}
	
	// Purpose: returns true since a leafnode is a leaf node. 
	public Boolean isLeaf() {
		return (true);
	}
	
	// Purpose: returns the right of the binary tree, unless there is none. 
	public bintree<X> getRightbt() throws Exception {
		throw new Exception("getRightbt: A leaf doesnot have a right subtree");
	}

	// Purpose: returns the left of the binary tree, unless there is none. 
	public bintree<X> getLeftbt() throws Exception {
		throw new Exception("getLeftbt: A leaf doesnot have a left subtree");
	}

	// Purpose: returns a boolean if this bintree is equal to another bintree
	public Boolean equals(bintree<X> t) {
		try{
			return (t.isLeaf() && t.getRootval() == this.val);
		}
		catch(Exception e){
			System.out.println("Error in equals: " + e.getMessage());
			return null;
		}
	}

	// Purpose: return this root value as a string
	public String inorderString() {
		try{
			return (this.getRootval().toString());
		}
		catch(Exception e){
			System.out.println("Error in inorder String" + e.getMessage());
			return null;
		}
	}
	
	// Purpose: uses the map concept by using a function on all nodes of a bintree
	public <Y> bintree<Y> btMap(IBTreeF<X, Y> f) {
		try{
			return (new leafnode<Y>(f.f(this.getRootval())));
		}
		catch(Exception e){
			System.out.println("Error in btMap: "+ e.getMessage());
			return null;
		}
	}

	// Purpose:uses the input of the val to be used in the visitor interface
	public <Y> Y visit(bintreeVisitor<X, Y> w){
		return (w.leafnode(this.val));
	}
	//Purpose: returns false because a leafnode is not empty
	public Boolean isEmpty() {
		return false;
	
	}
}
