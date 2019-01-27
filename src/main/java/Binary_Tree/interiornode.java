package Binary_Tree;

public class interiornode<X> extends Abintree<X> {
	private bintree<X> l, r;

	//Purpose: takes as input the value, the left bintree, and the right bintree
	public interiornode(X v, bintree<X> left, bintree<X> right) {
		val = v;
		l = left;
		r = right;
	}
	

	//Purpose: returns false since an interior node is not a leaf node
	public Boolean isLeaf() {
		return (false);
	}

	public bintree<X> getRightbt() throws Exception {
		//purpose: To return the right subtree attached to this interior node.
		return (this.r);
	}

	public bintree<X> getLeftbt() throws Exception {
		//purpose: To return the left subtree attached to this interior node.
		return (this.l);
	}

	public Boolean equals(bintree<X> t) {
		//purpose: To determine if this interior node is equal to a given binary tree
		try {
			return (!t.isLeaf() && this.getRootval().equals(t.getRootval()) && this.getLeftbt().equals(t.getLeftbt())
					&& this.getRightbt().equals(t.getRightbt()));
		} catch (Exception e) {
			System.out.println("Error equals in interior node: " + e.getMessage());
			return (false);
		}
	}

	public String inorderString() {
		//purpose: To return the items in this interior node as a string.
		try {
			return (this.getLeftbt().inorderString() + " " + this.getRootval().toString() + " "
					+ this.getRightbt().inorderString());
		} catch (Exception e) {
			System.out.println("Error inorderString in interiornode:" + e.getMessage());
			return (null);
		}
	}

	public <Y> bintree<Y> btMap(IBTreeF<X,Y> f){
		//purpose: To map the given function onto this interior node.
		try{
			return(new interiornode<Y>(f.f(this.getRootval()), this.getLeftbt().btMap(f), this.getRightbt().btMap(f)));
		}
		catch(Exception e){ 
			System.out.println("Error map in interiornode:" + e.getMessage());
			return(null);
		}
	}
	
	public <Y> Y visit(bintreeVisitor<X, Y> w){
		//purpose: To allow the user to make other binary tree functions outside the interface.
		return (w.interiornode(this.val, this.l, this.r));
	}
	public Boolean isEmpty() {
		//purpose: To return true if this interior node is empty. It's not.
		return false;
	}
}

		




