
public class Shape {
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
	public String toString() {
		String temp = "";
		temp = "The area is " + area + ", and the perimeter is " + perimeter;
		return temp;
	}
}
