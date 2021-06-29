public class hashmap {
	int size = 10;
	Node<entry>[] map = new Node[size];
	public void add(Object o, int i) {
	boolean loop = true;
	boolean loop2 = true;
	int counter = 1;
		if(map[Math.abs(o.hashCode() % map.length)] == null) {
			entry input = new entry(o, i);
			map[Math.abs(o.hashCode() % map.length)] = new Node(input);
		}
		else {
			Node<entry> placeholder = map[Math.abs(o.hashCode() % map.length)];
			Node<entry> placeholder2 = placeholder;
			while(loop) {
				if(placeholder.getNextNode() == null) {
					loop = false;
				}
				else {
					placeholder = placeholder.getNextNode();
					counter++;
				}
			}
			while(loop2) {
				placeholder = map[Math.abs(o.hashCode() % map.length)];
				if(counter == 0) {
					loop2 = false;
				}
				else {
					for(int j = 1; j < counter; j++) {
						placeholder = placeholder.getNextNode();
					}
					if(placeholder.getNextNode() == null) {
						new Node(placeholder.getData());
					}
					else {
						
					}
					placeholder2 = placeholder;
					placeholder = placeholder.getNextNode();
					placeholder.setData(placeholder2.getData()); 
					counter--;
				}
			}
			entry input = new entry(o, i);
			map[Math.abs(o.hashCode() % map.length)] = new Node(input);
		}
	}
	
	public int get(Object o) {
		boolean loop = true;
		int i = 0;
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