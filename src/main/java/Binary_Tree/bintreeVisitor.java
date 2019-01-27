package Binary_Tree;

public interface bintreeVisitor<X, Y>{
//purpose: To allow the user to make other binary tree functions outside the interface.
    
    //Purpose: uses the val, left bintree, and right bintree for other functions for the visitor
    public Y interiornode(X val, bintree<X> l, bintree<X> r);

    //Purpose: uses the val for other functions for the visitor
    public Y leafnode(X val);
    
    //Purpose: uses nothing for other functions for the visitor
    public Y emptyTree();
    

}