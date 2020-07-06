
public class nodeTest {
	public static void main(String[] args) {
		linkedList linkedList = new linkedList();
		
		linkedList.add(0);
		
		linkedList.add(1);
		
		linkedList.add(5);
		
		linkedList.add(3);
		
		System.out.print(linkedList.toString());
		
		linkedList.remove();
		
		System.out.println("BREAK");
		
		System.out.println("");
		
		System.out.println(linkedList.toString());
	}
}
