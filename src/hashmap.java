public class hashmap {
	int capacity = 10;
	int size = 0;
	Node<entry>[] map = new Node[capacity];
	public void add(Object o, Object i) {
		if(map[Math.abs(o.hashCode() % map.length)] == null) {
			entry input = new entry(o, i);
			map[Math.abs(o.hashCode() % map.length)] = new Node(input);
			size++;
		}
		else {
			Node<entry> tempholder = map[Math.abs(o.hashCode() % map.length)];
			entry input = new entry(o, i);
			map[Math.abs(o.hashCode() % map.length)] = new Node(input);
			map[Math.abs(o.hashCode() % map.length)].setNextNode(tempholder);
		}
		resize();
		
	}
	
	public Object get(Object o) {
		if(map[Math.abs(o.hashCode() % map.length)] == null) {
			throw new RuntimeException(o + " is an unregistered key");
		}
		else {
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
	}
	
	public void resize() {
		if(size >= capacity * (3.0/4.0)) {
			capacity = capacity * capacity;
			Node<entry>[] tempMap = new Node[capacity];
			for(int j = 0; j < map.length; j++) {
				if(map[j] != null) {
					tempMap[Math.abs(map[j].getData().getterKey().hashCode() % tempMap.length)] = map[j];
				}
			}
			map = tempMap;
		}
	}
	
	public void remove(Object o) {
		if(map[Math.abs(o.hashCode() % map.length)] == null) {
			System.out.println(o + " is an unregistered key");
		}
		else {
			if(map[Math.abs(o.hashCode() % map.length)].getNextNode() == null) {
				map[Math.abs(o.hashCode() % map.length)] = null;
			}
			else {
				boolean loop = true;
				boolean checker = false;
				Node<entry> nodePlaceholder = map[Math.abs(o.hashCode() % map.length)];
				Node<entry> nodePlaceholder2 = nodePlaceholder;
				entry placeholder = nodePlaceholder.getData();
				while(loop) {
					if(o == placeholder.getterKey()) {
						loop = false;
					}
					else {
						if(checker) {
							nodePlaceholder2 = nodePlaceholder2.getNextNode();
						}
						nodePlaceholder = nodePlaceholder.getNextNode();
						placeholder = nodePlaceholder.getData();
						checker = true;
					}
				}
				if(nodePlaceholder.getNextNode() == null) {
					nodePlaceholder2.setNextNode(null);
				}
				else {
					Node tempNode = new Node(nodePlaceholder.getNextNode());
					nodePlaceholder2.setNextNode(tempNode);
				}
				
			}
		}
	}
}

class entry {
	private Object key;
	private Object value;
	public entry(Object o, Object i){
		key = o;
		value = i;
	}
	public Object getterVal() {
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