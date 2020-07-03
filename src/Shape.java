
public abstract class Shape {
	private int area = 0;
	private int perimeter = 0;
	public Shape(int a, int p) {
		area = a;
		perimeter = p;
	}
	public int getArea() {
		return area;
	}
	public int getPerimeter() {
		return perimeter;
	}
	public abstract String toString();
}
