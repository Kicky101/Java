
public class diamond {
	public static void main(String[] args) {
		int size = 30;
		for(int i = 0; i<size; i++) {
			for(int b = i-1; b<size; b++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("x ");
			}
			System.out.println("");
		}
		for(int i = size; i>=0; i--) {
			for(int b = i-1; b<size; b++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("x ");
			}
			System.out.println("");
		}
	}
}
