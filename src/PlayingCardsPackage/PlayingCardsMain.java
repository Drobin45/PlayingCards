package PlayingCardsPackage;
import cards.Ranks;
// The above is unneeded because of the next line, but it is a good example of how to import classes
import cards.*;
//Using an * imports ALL classes in this package!!!

public class PlayingCardsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int firstCard = Suits.Clubs;
//int secondCard = Ranks.Jack;
		
		Card a = new Card(Ranks.Two, Suits.Diamonds);
		Card b = new Card(1, Suits.Diamonds);
		Card d = new Card(2, 0);
		Card e = new Card(0);
		
		// All of the above work, but are different syntax for declaring the Rank/Suit of the new card
				
		System.out.println(toString(a);
		System.out.println(b);
		System.out.println(d);
		
	}
}
