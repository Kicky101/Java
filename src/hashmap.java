public class hashmap {
	int size = 10;
	int[] map = new int[size];
	public void add(Object o, int i) {
		map[Math.abs(o.hashCode() % map.length)] = i;
	}
	
	public int get(Object o) {
		int i = map[Math.abs(o.hashCode() % map.length)];
		return i;
	}
}