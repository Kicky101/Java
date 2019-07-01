
public class hollowDiamond {
	public static void main(String[] args) {
		int size = 5;
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
			for(int j = 0; j<i; j++) {
				if(j==0 || j==i-1) {
					System.out.print("x ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		/*
		if(condition) {
			//Do something
		}else if(otherCondition) {
			//Do something else
		}else if(anotherCondition) {
			//Do another thing
		}else {
			//Do that
		}
		*/
	}
}
