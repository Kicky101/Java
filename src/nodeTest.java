
public class nodeTest {
	public static void main(String[] args) {
		linkedList linkedList = new linkedList();
		
		linkedList.add("bobble booey");
		
		linkedList.add(1);
		
		linkedList.add(5);
		
		linkedList.add(3);
		
		System.out.print(linkedList.toString());
		
		linkedList.remove();
		
		System.out.println("BREAK");
		
		System.out.println("");
		
		System.out.print(linkedList.toString());
		
		System.out.println("BREAK");
		
		System.out.println("");
		
		linkedList.specificAdd(4,2);
		
		System.out.print(linkedList.toString());
		
		System.out.println("BREAK");
		
		System.out.println("");
		
		linkedList.specificRemove(0);
		
		linkedList.specificRemove(0);
		
		System.out.print(linkedList.toString());
	}
}
