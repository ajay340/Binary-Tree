package Binary_Tree;

import static org.junit.Assert.*;

import org.junit.Test;

public class bintreeTests {

	bintree<Integer> L = new leafnode<Integer>(2);
	bintree<Integer> R = new leafnode<Integer>(3);
	bintree<Integer> T = new interiornode<Integer>(1, L, R);
	bintree<Integer> L1 = new leafnode<Integer>(2);
	bintree<Integer> R1 = new leafnode<Integer>(3);
	bintree<Integer> T1 = new interiornode<Integer>(1, L1, R1);
	bintree<Integer> DL = new leafnode<Integer>(4);
	bintree<Integer> DR = new leafnode<Integer>(6);
	bintree<Integer> DT = new interiornode<Integer>(2, DL, DR);

	bintree<String> SE = new emptyBintree<String>();
	bintree<Integer> IE = new emptyBintree<Integer>(); 
	bintree<Integer> IF = new emptyBintree<Integer>();

	bintree<Integer> N = new leafnode<Integer>(-5);
	bintree<Integer> M = new leafnode<Integer>(-1);
	bintree<Integer> N1 = new interiornode<Integer>(-7, N, M);
	
	postOrderTraversal Q1 = new postOrderTraversal();
	BinMax Q2 = new BinMax();
	
//NON-EMPTY TREE TESTS
	@Test
	public void bintreeTesting() {
		try {
			assertEquals(L.getRootval().intValue(), 2);
			assertEquals(T.getRootval().intValue(), 1);
			assertEquals(T.getLeftbt(), L);
			assertEquals(T.getRightbt(), R);
			assertEquals(R.equals(R1), true);
			assertEquals(T.equals(T1), true);
			assertEquals(L1.inorderString(), "2");
			assertEquals(T.inorderString(), "2 1 3");
			assertEquals(R1.btMap(x -> 2 * x).equals(DR), true);
			assertEquals(T.btMap(x -> 2 * x).equals(DT), true);
			assertEquals(T.isEmpty(), false);
			assertEquals(R.isEmpty(), false);

			
			
			

		} catch (Exception e) {
			System.out.println("Error in test: " + e.getMessage());
		}
	}
	
//EMPTY TREE TESTS	
	@Test
	public void emptyBintreeTesting() {
		try {
			assertEquals(IE.equals(IF), true);
			assertEquals(SE.inorderString(), "");
			assertEquals(SE.isLeaf(), false);
			assertEquals(SE.getLeftbt(), "Error with empty bintree testing: ");
			assertEquals(SE.getRightbt(),"Error with empty bintree testing: ");
			assertEquals(SE.getRootval(), "Error with empty bintree testing: ");
			assertEquals(IE.btMap(x -> 2 * x).equals(IF), true);
			assertEquals(IE.isEmpty(), true);
			
	}
	catch(Exception e){
		System.out.println("Error with empty bintree testing: " + e.getMessage());
		
	}
}
	
//VISIT TESTS
	@Test
	public void PostOrderTraversalTest() {
		assertEquals(R.visit(Q1), "3");
		assertEquals(T.visit(Q1), "2 3 1");
		assertEquals(IE.visit(Q1), "");
		assertEquals(T.visit(Q1), "2 3 1");
		assertEquals(DT.visit(Q1), "4 6 2");

		
	}
	
	@Test
	public void BinMaxtest() {
		assertEquals(T.visit(Q2).equals(3), true);
		assertEquals(T1.visit(Q2).equals(3), true);
		assertEquals(R.visit(Q2).equals(3), true);
		assertEquals(DL.visit(Q2).equals(4), true);

		assertEquals(N1.visit(Q2).equals(-1), true);
		assertEquals(N.visit(Q2).equals(-5), true);
		assertEquals(M.visit(Q2).equals(-1), true);
		assertEquals(IE.visit(Q2).equals(Integer.MIN_VALUE), true);
	

	}
	

}
