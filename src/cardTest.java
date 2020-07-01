public class cardTest {
	public static void main(String[] args) {
		Deck theDeck = new Deck();
		
		Hand rightHand = new Hand();
		
		Hand leftHand = new Hand();
		
		System.out.println("Unshuffled Deck");
		System.out.println("");
		System.out.println(theDeck);

		theDeck.shuffle();
		
		System.out.println(theDeck);
		
		rightHand.Draw2(theDeck.Draw());
		rightHand.Draw2(theDeck.Draw());
		rightHand.Draw2(theDeck.Draw());
		
		System.out.println(rightHand);
		
		System.out.println(leftHand);
		
		leftHand.Draw2(rightHand.handDraw());
		leftHand.Draw2(rightHand.handDraw());

		System.out.println(leftHand);
		
		System.out.println(rightHand);
		
		rightHand.Draw2(leftHand.handDraw());
		
		System.out.println(leftHand);
		
		System.out.println(rightHand);

	}
}
