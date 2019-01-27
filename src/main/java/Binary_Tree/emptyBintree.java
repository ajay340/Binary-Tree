package Binary_Tree;

public class emptyBintree<X> implements bintree<X>{


    public X getRootval() throws Exception{
    	//purpose: To get the value of this tree's root. It throws an exception because the tree is empty and there is no root.
        throw new Exception("No root value in an empty tree");
    }
    public Boolean isLeaf(){
    	//purpose: To return true if this tree is a leaf. It is false because there is no leaf.
        return false;
    }
    public bintree<X> getRightbt() throws Exception {
    	//purpose: To get the right subtree of this binary tree. It throws an exception because the tree is empty.
		throw new Exception("Method first applied to an empty list.");
	}

	public bintree<X> getLeftbt() throws Exception {
		//purpose: To get the left subtree of this binary tree. It throws an exception because the tree is empty.
		throw new Exception("Method first applied to an empty list.");
    }
    public Boolean equals(bintree<X> t){
    	//purpose: to return true if this binary tree equals a given binary tree. It will only be true if both trees are equal.
        return t.isEmpty();
    }
    public String inorderString(){
    	//purpose: To return the items in this tree as a string. It returns an empty string because the tree is empty.
        return "";
    }
    public <Y> bintree<Y> btMap(IBTreeF<X, Y> f){
    	//purpose: To map a function onto the binary tree. It just returns another empty tree because applying a function to an empty tree does nothing.
        return (new emptyBintree());
    }

	public <Y> Y visit(bintreeVisitor<X, Y> w){
		//purpose: To allow the user to make other binary tree functions outside the interface. It always comes back empty because this binary tree is empty.
        return w.emptyTree();
    }
	public Boolean isEmpty() {
		//purpose: To determine if this binary tree is empty. It is.
		return true;
	}
}