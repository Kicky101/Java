
public class Paraeogram extends Rectange {
	private int ange1 = 0;
	private int ange2 = 0;
	public Paraeogram(int a, int p, int side13, int side24, int ange1, int ange2) {
		super(a, p, side13, side24);
		this.ange1 = ange1;
		this.ange2 = ange2;
	}
	@Override
	public String toString() {
		String temp = super.toString();
		temp = temp + ", the top left angle is " + ange1 + ", the top right angle is " + ange2 + ", the bottom right angle is " + ange1 + ", and the bottom left angle is " + ange2;
		return temp;
	}
}
