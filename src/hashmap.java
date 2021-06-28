public class hashmap {
	int size = 10;
	Node<entry>[] map = new Node[size];
	public void add(Object o, int i) {
	boolean loop = true;
		if(map[Math.abs(o.hashCode() % map.length)] == null) {
			entry input = new entry(o, i);
			map[Math.abs(o.hashCode() % map.length)] = new Node(input);
		}
		else {
			Node placeholder = map[Math.abs(o.hashCode() % map.length)];
			while(loop) {
				if(placeholder.getNextNode() == null) {
					loop = false;
				}
				placeholder = placeholder.getNextNode();
			}
			placeholder = placeholder.getNextNode();
			entry input = new entry(o, i);
			placeholder = new Node(input);
		}
	}
	
	public int get(Object o) {
		/*
		entry input = new entry(o, i);
		Node placeholder = new Node(input);
		if(map[Math.abs(o.hashCode() % map.length)].getNextNode() == null) {
			placeholder = map[Math.abs(o.hashCode() % map.length)].getNextNode();
			
		}
		*/
		int i = 0;
		return i;
	}
}

class entry {
	private Object key;
	private int value;
	public entry(Object o, int i){
		key = o;
		value = i;
	}
}