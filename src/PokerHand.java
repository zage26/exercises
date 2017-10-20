
public class PokerHand extends Deck{
	
	public Card[] hand = new Card[7];

	public PokerHand() {
	}
	
	//Adds given card to hand array
	public void add(int index, Card card) {
		hand[index] = card;
	}
	
	//Prints out the card value 
	public void printPoker() {
		for (int i = 0; i < 7; i++) {
			System.out.println(hand[i]);
		}
	}
	
	//returns a boolean indicating whether the hand contains a flush
	public boolean hasFlush() {
	      boolean hasFlush = true;
	      int suit = hand[0].suit;
	      for (int i = 0; i < hand.length; i++)
	      {
	         if (hand[i].suit != suit)
	         {
	            hasFlush = false;
	            break;
	         }
	      }
	      System.out.println(hasFlush);
	      return hasFlush;
	}
	
	//Checks if a pokerhand has three of a kind
	public boolean hasThreeKind() {
		
		boolean[] Three = new boolean[7];
		int t = 0;
		
		for(int i = 0; i < 7; i++) {
			if(hand[i].rank == hand[0].rank) {
				t++;
			}if(hand[i].rank == hand[1].rank) {
				t++;
			}if(hand[i].rank == hand[2].rank) {
				t++;
			}if(hand[i].rank == hand[3].rank) {
				t++;
			}if(hand[i].rank == hand[4].rank) {
				t++;
			}if (t >= 3) {
				Three[i] = true;
			} else {
				Three[i] = false;
			}
			t = 0;
		}
		
		for(int i = 0; i < 7; i++) {
			if(Three[i] == true) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;	
	}	
	
	
	//Gets the probs of recieving a three of a kind or flush in poker
	public void getProbs(Deck deck) {
		int hasFlush = 0;
		int hasThreeKind = 0;
		int finalNum = 2000;
		
		for(int i = 0; i < finalNum; i++) {
			if (deck.deal().hasFlush()) hasFlush++; 
			if (deck.deal().hasThreeKind()) hasThreeKind++; 
		}
		
		System.out.println("Probs 3: " + hasThreeKind/finalNum);
		System.out.println("Probs flush: " + hasFlush/finalNum);
	}
	
	//Other method for other type of poker hand
	public boolean hasFourKind() {
		
		boolean[] Three = new boolean[7];
		int t = 0;
		
		for(int i = 0; i < 7; i++) {
			if(hand[i].rank == hand[0].rank) {
				t++;
			}if(hand[i].rank == hand[1].rank) {
				t++;
			}if(hand[i].rank == hand[2].rank) {
				t++;
			}if(hand[i].rank == hand[3].rank) {
				t++;
			}if(hand[i].rank == hand[4].rank) {
				t++;
			}if (t >= 4) {
				Three[i] = true;
			} else {
				Three[i] = false;
			}
			t = 0;
		}
		
		for(int i = 0; i < 7; i++) {
			if(Three[i] == true) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}
}
