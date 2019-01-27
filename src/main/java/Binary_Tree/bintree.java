package Binary_Tree;

public interface bintree<X> {
	//Purpose: returns the root value of the bintree
	public X getRootval() throws Exception;

	public Boolean isLeaf();
	//purpose: to return true if this binary tree is a leaf

	public bintree<X> getRightbt() throws Exception;
	//purpose: To return the right subtree of this binary tree. The exception applies to empty binary trees.

	public bintree<X> getLeftbt() throws Exception;
	//purpose: To return the left subtree of this binary tree. The exception applies to empty binary trees.

	public Boolean equals(bintree<X> t);
	//purpose: To return true if the given binary tree is exactly the same as this binary tree.

	public String inorderString();
	//purpose: To return the items in this tree as a string.

	public <Y> bintree<Y> btMap(IBTreeF<X, Y> f);
	//purpose: To map a given function onto this binary tree.

	public <Y> Y visit(bintreeVisitor<X, Y> W);
	//purpose: To allow the user to make other binary tree functions outside the interface.
	
	public Boolean isEmpty();
	//purpose: To return true if this binary tree is empty


}
