package cards;

public class Card {

	private int rank;
	private int suit;
	
	public Card (int Ranks, int Suits)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public Card (int cardno)
	{
		this.rank = cardno % 13;
		this.suit = (cardno/13) % 4;
	}
	
	public int rank()
	{
		return rank;
	}
	
	public int suit() {
		return suit;
	}
	
	public boolean sameSuit(Card c)
	{
		return this.suit == c.suit;
	}
	
	public boolean sameRank(Card c)
	{
		return this.rank == c.rank;
	}
	
	public boolean sameCard(Card c)
	{
		return (this.sameSuit(c) && this.sameRank(c));
	}
	
	@Override
	public String toString() {
		String rank = "23456789JQKA";
		String suit = "\u2663\u2666\u2665\u2660"; //Club, Diamond, Heart, Spade
		return rank.charAt(this.rank) + "" + suit.charAt(this.suit);
	}
}
