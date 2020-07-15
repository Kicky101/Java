
public class treeNodeTest {
	public static void main(String[] args) {
		Tree Tree = new Tree();
		
		//      3
		//    2   5
		//  1       51
		//        7
		
		
		
		
		Tree.add(3);
		
		Tree.add(2);
		
		Tree.add(5);
		
		Tree.add(1);
		
		Tree.add(51);
		
		Tree.add(7);
		
		System.out.println(Tree.toString());
		
		Tree.remove(7);
		
		System.out.println(Tree.toString());
	}
}
