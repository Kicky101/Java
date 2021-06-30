public class hashmap {
	int capacity = 10;
	int size = 0;
	Node<entry>[] map = new Node[capacity];
	public void add(Object o, int i) {
		if(map[Math.abs(o.hashCode() % map.length)] == null) {
			entry input = new entry(o, i);
			map[Math.abs(o.hashCode() % map.length)] = new Node(input);
		}
		else {
			Node<entry> tempholder = map[Math.abs(o.hashCode() % map.length)];
			entry input = new entry(o, i);
			map[Math.abs(o.hashCode() % map.length)] = new Node(input);
			map[Math.abs(o.hashCode() % map.length)].setNextNode(tempholder);
		}
		size++;
	}
	
	public int get(Object o) {
		boolean loop = true;
		if(map[Math.abs(o.hashCode() % map.length)].getNextNode() == null) {
			entry placeholder = map[Math.abs(o.hashCode() % map.length)].getData();
			return placeholder.getterVal();
		}
		else {
			Node<entry> nodePlaceholder = map[Math.abs(o.hashCode() % map.length)];
			entry placeholder = nodePlaceholder.getData();
			while(loop) {
				if(o == placeholder.getterKey()) {
					loop = false;
				}
				else {
					nodePlaceholder = nodePlaceholder.getNextNode();
					placeholder = nodePlaceholder.getData();
				}
			}
			return  placeholder.getterVal();
		}
	}
	
	public void resize() {
		if(size * (3/4) >= capacity) {
			capacity = capacity * capacity;
			Node<entry>[] tempMap = new Node[capacity];
			boolean loop = true;
			int counter = 0;
			Node tempNode = new Node(map[0].getData());
			while(loop) {
				tempMap[counter] = tempNode;
				counter++;
			}
		}
	}
}

class entry {
	private Object key;
	private int value;
	public entry(Object o, int i){
		key = o;
		value = i;
	}
	public int getterVal() {
		return value;
	}
	public Object getterKey() {
		return key;
	}
	public void setter(Object o, int i) {
		key = o;
		value = i;
	}
}