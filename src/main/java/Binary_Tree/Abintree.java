package Binary_Tree;

public abstract class Abintree<X> implements bintree<X>{
	//purpose: This is the abstract class for binary trees and it implements the bintree interface to make functions on binary trees.

    protected X val;
    //Purpose: returns the value of the node as the root
    public X getRootval() throws Exception{
        return this.val;
    }
}